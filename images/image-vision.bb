# image-vision
SUMMARY = "PPC SBC Computer Vision image"
DESCRIPTION = " \
    Image to be loaded in an Board Computer (SBC) \
    embedded in a custom Pogo-Pin Cassette (PPC) used to \
    observe a Device-under-Test (DUT) during production \
    firmware programming and In-Circuit Testing (ICT) with \
    Blue Clover's Production Line Tool (PLT) with \
    Camera Control and tooling for Image Processing. \
"
HOMEPAGE = "https://docs.pltcloud.com/acc/ppc/yocto/"

inherit core-image

IMAGE_FEATURES:append = " allow-empty-password"
IMAGE_FEATURES:append = " allow-root-login"
IMAGE_FEATURES:append = " empty-root-password"
IMAGE_FEATURES:append = " read-only-rootfs"

IMAGE_INSTALL:append = " packagegroup-ppc-sbc"
IMAGE_INSTALL:append = " systemd-auto-login-ttygs0"

#IMAGE_INSTALL:append = " libedit"
#IMAGE_INSTALL:append = " libudev"

IMAGE_INSTALL:append = " libcamera-apps"
IMAGE_INSTALL:append = " pltagent-cam"
IMAGE_INSTALL:append = " opencv opencv-apps python3-opencv"
IMAGE_INSTALL:append = " python3-picamera2"

IMAGE_INSTALL:append:raspberrypi4 = " rpi-eeprom"
IMAGE_INSTALL:append:raspberrypi4-64 = " rpi-eeprom"
IMAGE_INSTALL:append:raspberrypi5 = " rpi-eeprom"

fakeroot do_populate_bcdevices_src () {
        # Allow pltagent to use sudo
        echo "pltagent ALL=(ALL) NOPASSWD: ALL" >> ${IMAGE_ROOTFS}/etc/sudoers
}
IMAGE_PREPROCESS_COMMAND += "do_populate_bcdevices_src; "
