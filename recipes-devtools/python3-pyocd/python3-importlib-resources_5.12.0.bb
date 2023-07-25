SUMMARY = "Read resources from Python packages"
HOMEPAGE = "https://pypi.org/project/importlib-resources/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "importlib_resources"
UPSTREAM_CHECK_REGEX = "/importlib-resources/(?P<pver>(\d+[\.\-_]*)+)/"

SRC_URI[sha256sum] = "4be82589bf5c1d7999aedf2a45159d10cb3ca4f19b2271f8792bc8e6da7b22f6"

S = "${WORKDIR}/importlib_resources-${PV}"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native ${PYTHON_PN}-toml-native"
#RDEPENDS:${PN} += "${PYTHON_PN}-zipp ${PYTHON_PN}-pathlib2"
RDEPENDS:${PN}:append:class-target = " python3-misc"
RDEPENDS:${PN}:append:class-nativesdk = " python3-misc"

BBCLASSEXTEND = "native nativesdk"
