FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://serial-getty@.service"

do_install:append() {
	install -m 0644 ${S}/serial-getty@.service ${D}${systemd_system_unitdir}/
}
