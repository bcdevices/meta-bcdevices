## Makefile: meta-bcddev
#
# SPDX-LICENSE-IDENTIFIER: MIT

.PHONY: all clean default dist distclean
default: all

#all:kas-base
#all:kas-rpi4
#all:kas-rpi5
#all:kas-nxp-spsdk-rpi4
all:kas-vision-rpi4
#all:kas-vision-rpi5
#all:kas-vision-rpiz2w

.PHONY: kas-%
kas-%: scripts/kas/kas-%.yml
	@echo [$@]
	kas build $<

.PHONY: dist-prep
dist-prep:
	@mkdir -p dist

.PHONY: package-raspberrypy4-64-images
package-raspberrypi4-64-images: dist-prep
	@echo [$@]
	install -m 0644 $(shell find "build/tmp/deploy/images/raspberrypi4-64" \
	  -type f -name "*-raspberrypi4-64.rootfs-*.wic.bz2") dist

.PHONY: package-images
package-images: package-raspberrypi4-64-images
	@echo [$@]

dist: dist-prep all package-images
	@echo [$@]

clean:
	@echo [$@]
	@rm -rf build/tmp

distclean:
	@echo [$@]
	@rm -rf build
