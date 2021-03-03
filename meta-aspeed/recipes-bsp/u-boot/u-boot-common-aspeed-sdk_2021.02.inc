HOMEPAGE = "https://github.com/AspeedTech-BMC/u-boot"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "9f84f4b33ec77807b79ab86efaefc187f250a7d7"

SRC_URI = "git://git@github.com/klauskiwi/u-boot.git;branch=hace_sg_work;protocol=https"

S = "${WORKDIR}/git"

PV = "v2021.02+git${SRCPV}"
