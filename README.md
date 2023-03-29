# meta-bcdevices

Yocto layer for inclusion in images for a Single-Board
Computer (SBC) embedded in a custom Pogo-Pin Cassette (PPC),
used to interact with the Device-under-Test (DUT) during
production firmware programming and In-Circuit Testing (ICT) with Blue Clover's
[Production Line Tool (PLT)](https://bcdevices.com/pages/production-line-tool).

## Dependencies

This layer depends on:

* URI: git://git.yoctoproject.org/poky

## Sample Image Build

### Prerequisites

- Linux build host
- [siemens/kas: Setup tool for bitbake based projects](https://github.com/siemens/kas):
  ```shell
  sudo pip3 install kas
  ```

### Instructions

1. Build
   ```shell
   kas build meta-bcdevices/kas-rpi4.yml
   ```
2. copy the generated `.sd-img` file to the SD card
3. Boot your RPi4
