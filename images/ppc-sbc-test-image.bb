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

inherit core-image

IMAGE_INSTALL:append = " packagegroup-ppc-sbc"
IMAGE_INSTALL:append = " python3-intelhex"
