# python3-pyocd
SUMMARY = "Cortex-M debugger for Python"
DESCRIPTION = "\
  pyOCD is an open source Python based tool and package for \
  programming and debugging Arm Cortex-M microcontrollers with \
  a wide range of debug probes. \
"
HOMEPAGE = "https://pyocd.io/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=421492e27872cb498685e9d7649f63a2"

PYPI_PACKAGE = "pyocd"
SRC_URI[sha256sum] = "937782acc9daff054d50fb7c6f788cd94a84f80f0b85f25aacab99dc98228648"

inherit pypi setuptools3

RDEPENDS:${PN} += " python3-setuptools"

RDEPENDS:${PN} += " python3-capstone"
#RDEPENDS:${PN} += " python3-cmsis-pack-manager"
RDEPENDS:${PN} += " python3-colorama"
RDEPENDS:${PN} += " python3-importlib-metadata"
RDEPENDS:${PN} += " python3-importlib-resources"
RDEPENDS:${PN} += " python3-intelhex"
RDEPENDS:${PN} += " python3-intervaltree"
RDEPENDS:${PN} += " python3-lark"
RDEPENDS:${PN} += " python3-libusb-package"
RDEPENDS:${PN} += " python3-natsort"
RDEPENDS:${PN} += " python3-prettytable"
RDEPENDS:${PN} += " python3-psutil"
RDEPENDS:${PN} += " python3-pyelftools"
RDEPENDS:${PN} += " python3-pylink-square"
RDEPENDS:${PN} += " python3-pyocd-pemicro"
RDEPENDS:${PN} += " python3-pyusb"
RDEPENDS:${PN} += " python3-pyyaml"
RDEPENDS:${PN} += " python3-six"
RDEPENDS:${PN} += " python3-typing-extensions"

#RRECOMMENDS:${PN} += " segger-jlink"
