# python3-pylink-square
SUMMARY = "Python interface for SEGGER J-Link"
HOMEPAGE ="https://pypi.org/project/pylink-square"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=834c4b2cb72db13143b58bebff15bafb"
LICENSE = "Apache-2.0"

PYPI_PACKAGE = "pylink-square"
SRC_URI[sha256sum] = "c91261ae19a7ef6c70fda24f06da98272b27518dd71472c709e170afdee89f88"

inherit pypi setuptools3

DEPENDS += " python3-six-native"

RDEPENDS:${PN} += " python3-future"
RDEPENDS:${PN} += " python3-setuptools"

# To use SEGGER J-Link runtime library in pylink-square:
# ```
# export LD_LIBRARY_PATH="/opt/SEGGER/JLink:$LD_LIBRARY_PATH"
# ```
#RRECOMMENDS:${PN} += " segger-jlink"
