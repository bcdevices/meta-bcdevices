# segger-jlink-placeholder
SUMMARY = "Environment placeholder for SEGGER J-Link Software and Documentation Pack"
DESCRIPTION = "Installs dependencies and a placeholder directory for jlink. The binary must be manually installed to /opt/SEGGER/JLink"
HOMEPAGE = "https://www.segger.com/downloads/jlink/"

# SEGGER J-Link Software and Documentation Pack is proprietary, this placeholder is not.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

#S = "${WORKDIR}/sources"
#UNPACKDIR = "${S}"

do_install() {
    install -d ${D}/opt/SEGGER/JLink
    echo "J-Link Software and Documentation pack must be installed manually at /opt/SEGGER/JLink" > ${D}/opt/SEGGER/JLink/README
}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

RDEPENDS:${PN} = " glibc libudev libedit"

FILES:${PN} = " \
  /opt/SEGGER/JLink/README \
"

RRECOMMENDS:${PN} = " dpkg"
RDEPENDS:${PN} = " dpkg"

RCONFLICTS:${PN} = "segger-jlink"
