require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-microwatt:"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/joel/microwatt.git;branch=${KBRANCH};protocol=https"

KBRANCH = "microwatt-5.11"
LINUX_VERSION ?= "5.11"
SRCREV ?= "4db9d89001c894c33a8813a96d8b97b8c91c2b1c"

PV = "${LINUX_VERSION}+git${SRCPV}"

# Store the defconfig in the layer
KCONFIG_MODE="--alldefconfig"
SRC_URI += " file://defconfig"

KMETA = "kernel-meta"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "elfutils-native openssl-native util-linux-native"

KERNEL_VERSION_SANITY_SKIP = "1"
