# python3-libusb-package
SUMMARY = "Package containing libusb so it can be installed via Python package managers"
HOMEPAGE ="https://pypi.org/project/libusb-package"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"
LICENSE = "Apache-2.0"

PYPI_PACKAGE = "libusb-package"
SRC_URI[sha256sum] = "5a586744a59e3870791c28f964568e211f5f44bb398ccb51b25f3565dd4666ad"

inherit pypi setuptools3

DEPENDS += " python3-setuptools-scm-native"
