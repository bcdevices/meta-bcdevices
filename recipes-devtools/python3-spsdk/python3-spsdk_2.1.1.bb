# python3-spsdk
SUMMARY = "Secure Provisioning SDK (SPSDK) for NXP MCU portfolio."
DESCRIPTION = "\
    Secure Provisioning SDK (SPSDK) enables connection and communication \
    with target devices for purposes of secure provisioning and programming. \
    Delivered as python library with command-line applications for direct \
    utilization. \
"
HOMEPAGE = "https://github.com/nxp-mcuxpresso/spsdk"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c72a66edfa65948c15795224be74979"
SRC_URI[sha256sum] = "2251c370d7493729295a551564c206381a06e830e366f2f5fd3154172cd10f21"

PYPI_PACKAGE = "spsdk"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-appdirs"
RDEPENDS:${PN} += "python3-argparse-addons"
RDEPENDS:${PN} += "python3-asn1crypto"
RDEPENDS:${PN} += "python3-astunparse"
RDEPENDS:${PN} += "python3-bincopy"
RDEPENDS:${PN} += "python3-bitstring"
RDEPENDS:${PN} += "python3-capstone"
RDEPENDS:${PN} += "python3-cffi"
RDEPENDS:${PN} += "python3-click"
RDEPENDS:${PN} += "python3-click-command-tree"
RDEPENDS:${PN} += "python3-click-option-group"
RDEPENDS:${PN} += "python3-colorama"
RDEPENDS:${PN} += "python3-commentjson"
RDEPENDS:${PN} += "python3-construct"
RDEPENDS:${PN} += "python3-crcmod"
RDEPENDS:${PN} += "python3-cryptography"
RDEPENDS:${PN} += "python3-deepmerge"
RDEPENDS:${PN} += "python3-fastjsonschema"
RDEPENDS:${PN} += "python3-future"
RDEPENDS:${PN} += "python3-hexdump"
RDEPENDS:${PN} += "python3-humanfriendly"
RDEPENDS:${PN} += "python3-importlib-metadata"
RDEPENDS:${PN} += "python3-intelhex"
RDEPENDS:${PN} += "python3-intervaltree"
RDEPENDS:${PN} += "python3-jinja2"
RDEPENDS:${PN} += "python3-libusb-package"
RDEPENDS:${PN} += "python3-libusbsio"
RDEPENDS:${PN} += "python3-markupsafe"
RDEPENDS:${PN} += "python3-modules"
RDEPENDS:${PN} += "python3-natsort"
RDEPENDS:${PN} += "python3-oscrypto"
RDEPENDS:${PN} += "python3-platformdirs"
RDEPENDS:${PN} += "python3-prettytable"
RDEPENDS:${PN} += "python3-psutil"
RDEPENDS:${PN} += "python3-pyasn1"
RDEPENDS:${PN} += "python3-pycparser"
RDEPENDS:${PN} += "python3-pyelftools"
RDEPENDS:${PN} += "python3-pylink-square"
RDEPENDS:${PN} += "python3-pyocd"
RDEPENDS:${PN} += "python3-pyocd-pemicro"
RDEPENDS:${PN} += "python3-pypemicro"
RDEPENDS:${PN} += "python3-pyserial"
RDEPENDS:${PN} += "python3-pyusb"
RDEPENDS:${PN} += "python3-pyyaml"
RDEPENDS:${PN} += "python3-requests"
RDEPENDS:${PN} += "python3-ruamel.yaml"
RDEPENDS:${PN} += "python3-setuptools"
RDEPENDS:${PN} += "python3-six"
RDEPENDS:${PN} += "python3-sly"
RDEPENDS:${PN} += "python3-sortedcontainers"
RDEPENDS:${PN} += "python3-spsdk"
RDEPENDS:${PN} += "python3-typing-extensions"
RDEPENDS:${PN} += "python3-wcwidth"
RDEPENDS:${PN} += "python3-wheel"
RDEPENDS:${PN} += "python3-yamlloader"
RDEPENDS:${PN} += "python3-zipp"
