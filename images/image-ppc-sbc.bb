# image-ppc-sbc
SUMMARY = "PPC SBC Image"
DESCRIPTION = "\
    Image with pltagent, a test controller agent for Blue Clover's \
    Production Line Tool (PLT). \
    \
    This image can be loaded in a Single-Board Computer (SBC) \
    embedded in a custom Pogo-Pin Cassette (PPC) used to \
    interact with the Device-under-Test (DUT) during production \
    firmware programming and In-Circuit Testing (ICT). \
"
HOMEPAGE = "https://bcdevices.com/pages/production-line-tool"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit core-image

#CORE_IMAGE_BASE_INSTALL += "flashrom"
#CORE_IMAGE_BASE_INSTALL += "openocd"
CORE_IMAGE_BASE_INSTALL += "pltagent"
#CORE_IMAGE_BASE_INSTALL += "usb-modeswitch"
CORE_IMAGE_BASE_INSTALL += "util-linux-agetty"
