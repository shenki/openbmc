PREFERRED_PROVIDER_virtual/kernel ?= "linux-microwatt"

# Build a FIT image and stuff core-image-minimal in it by default.
KERNEL_IMAGETYPE ?= "dtbImage.microwatt"
INITRAMFS_IMAGE ?= "aspeed-image-initramfs"
INITRAMFS_FSTYPES ?= "cpio.xz"

WKS_FILE ?= "emmc-aspeed.wks.in"
WKS_FILE_DEPENDS ?= " \
    phosphor-hostfw-image \
    virtual/kernel \
"
WKS_HOSTFW_SIZE ?= "5G"
IMAGE_BOOT_FILES ?= "dtbImage.microwatt;kernel"

MACHINE_EXTRA_RRECOMMENDS += "udev-aspeed-vuart udev-aspeed-mtd-partitions"
MACHINE_FEATURES += "hw-rng"

SERIAL_CONSOLES ?= "115200;ttyS4"

DEFAULTTUNE_microwatt := "powerpc64le"

# Add general MACHINEOVERRIDE for meta-microwatt
MACHINEOVERRIDES =. "microwatt:"

include conf/machine/include/powerpc/arch-powerpc64.inc
