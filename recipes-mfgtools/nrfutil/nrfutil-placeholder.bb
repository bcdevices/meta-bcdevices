# nrfutil-placeholder
SUMMARY = "Environment placeholder for Nordic nRF Util"
DESCRIPTION = "Installs dependencies and a placeholder directory for nrfutil. The binary must be manually installed to /opt/nrfutil/nrfutil."
HOMEPAGE = "https://www.nordicsemi.com/Products/Development-tools/nRF-Util"
# nRF-Util is proprietary, this placeholder is not.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

#S = "${WORKDIR}/sources"
#UNPACKDIR = "${S}"

do_install() {
    install -d ${D}/opt/nrfutil
    echo "nrfutil binary must be installed manually at /opt/nrfutil/nrfutil" > ${D}/opt/nrfutil/README
}

FILES:${PN} = " \
  /opt/nrfutil/README \
"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# All runtime dependencies the real nrfutil binary expects
RDEPENDS:${PN} += "libusb1 libudev libedit"
#RRECOMMENDS:${PN} = "segger-jlink"

PACKAGE_ARCH = "${TUNE_ARCH}"
RCONFLICTS:${PN} = "nrfutil"
