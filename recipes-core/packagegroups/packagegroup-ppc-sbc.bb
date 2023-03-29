# packagegroup-ppc-sbc
DESCRIPTION = "PPC SBC package group"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = "\
    pltagent \
    util-linux-agetty \
"
