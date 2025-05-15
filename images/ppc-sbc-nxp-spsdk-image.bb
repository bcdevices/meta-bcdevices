# ppc-sbc-nxp-spsdk-image
SUMMARY = "PPC SBC NXP SPSDK image"
DESCRIPTION = " \
    Image to be loaded in an Board Computer (SBC) \
    embedded in a custom Pogo-Pin Cassette (PPC) used to \
    interact with a Device-under-Test (DUT) during production \
    firmware programming and In-Circuit Testing (ICT) with \
    Blue Clover's Production Line Tool (PLT) with \
    the NXP Secure Provisioning SDK (SPSDK). \
"
HOMEPAGE = "https://docs.pltcloud.com/acc/ppc/yocto/"

inherit core-image

IMAGE_FEATURES:append = " allow-empty-password"
IMAGE_FEATURES:append = " allow-root-login"
IMAGE_FEATURES:append = " empty-root-password"

IMAGE_INSTALL:append = " packagegroup-ppc-sbc"
IMAGE_INSTALL:append = " python3-intelhex"
IMAGE_INSTALL:append = " python3-pyocd"
IMAGE_INSTALL:append = " python3-spsdk"

# Optional, non-redistributable packages
#IMAGE_INSTALL:append = " nxp-mcu-link"
#IMAGE_INSTALL:append = " nxp-libusbsio-bin"
#IMAGE_INSTALL:append = " nxp-lpcscrypt"
#IMAGE_INSTALL:append = " segger-jlink-ob-nxp"

IMAGE_INSTALL:append:raspberrypi4 = " rpi-eeprom"
IMAGE_INSTALL:append:raspberrypi4-64 = " rpi-eeprom"
IMAGE_INSTALL:append:raspberrypi5 = " rpi-eeprom"

# lrzsz is a unix communication package providing the XMODEM,
# YMODEM ZMODEM file transfer protocols.
IMAGE_INSTALL:append = " lrzsz"

fakeroot do_populate_bcdevices_src () {
        # Allow pltagent to use sudo
        echo "pltagent ALL=(ALL) NOPASSWD: ALL" >> ${IMAGE_ROOTFS}/etc/sudoers
}
IMAGE_PREPROCESS_COMMAND += "do_populate_bcdevices_src; "
