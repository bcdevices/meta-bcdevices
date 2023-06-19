# packagegroup-ppc-sbc
DESCRIPTION = "PPC SBC package group"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
    pltagent \
    pltagent-msc-host \
    util-linux-agetty \
"
