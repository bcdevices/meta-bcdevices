# ppc-sbc-test-image
SUMMARY = "Sample PPC SBC Image"
DESCRIPTION = " \
    Sample image to be loaded in a Single-Board Computer (SBC) \
    embedded in a custom Pogo-Pin Cassette (PPC) used to \
    interact with the Device-under-Test (DUT) during production \
    firmware programming and In-Circuit Testing (ICT) with \
    Blue Clover's Production Line Tool (PLT). \
"
HOMEPAGE = "https://bcdevices.com/pages/production-line-tool"
LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit core-image

IMAGE_INSTALL:append = " packagegroup-ppc-sbc"
#IMAGE_INSTALL:append = " pltagent"
#IMAGE_INSTALL:append = " util-linux-agetty"

#IMAGE_INSTALL:append = " flashrom"
#IMAGE_INSTALL:append = " openocd"
#IMAGE_INSTALL:append = " usb-modeswitch"
