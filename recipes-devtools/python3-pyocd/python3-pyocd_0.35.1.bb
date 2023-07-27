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
SRC_URI[sha256sum] = "02e8084f4d3b26d4d7c7470bb470fd4edc6c2bf2ba781e3dd94da4f84571c975"

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
RDEPENDS:${PN} += " python3-pyelftools"
RDEPENDS:${PN} += " python3-pylink-square"
RDEPENDS:${PN} += " python3-pyusb"
RDEPENDS:${PN} += " python3-pyyaml"
RDEPENDS:${PN} += " python3-six"

#RRECOMMENDS:${PN} += " segger-jlink"
RRECOMMENDS:${PN} += " python3-pyocd-pemicro"
