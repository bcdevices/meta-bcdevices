# ppc-sbc-test-image
SUMMARY = "Sample PPC SBC Image"
DESCRIPTION = " \
    Sample image to be loaded in a Single-Board Computer (SBC) \
    embedded in a custom Pogo-Pin Cassette (PPC) used to \
    interact with the Device-under-Test (DUT) during production \
    firmware programming and In-Circuit Testing (ICT) with \
    Blue Clover's Production Line Tool (PLT). \
"
HOMEPAGE = "https://docs.pltcloud.com/acc/ppc/yocto/"

inherit core-image

IMAGE_FEATURES:append = " debug-tweaks"
IMAGE_FEATURES:append = " empty-root-password"
IMAGE_FEATURES:append = " read-only-rootfs"

IMAGE_INSTALL:append = " packagegroup-ppc-sbc"
IMAGE_INSTALL:append = " python3-intelhex"
IMAGE_INSTALL:append = " python3-pyocd"
IMAGE_INSTALL:append = " libedit"
IMAGE_INSTALL:append = " libudev"

IMAGE_INSTALL:append:rpi = " rpi-eeprom"

fakeroot do_populate_bcdevices_src () {
        # Allow pltagent to use sudo
        echo "pltagent ALL=(ALL) NOPASSWD: ALL" >> ${IMAGE_ROOTFS}/etc/sudoers
}
IMAGE_PREPROCESS_COMMAND += "do_populate_bcdevices_src; "
