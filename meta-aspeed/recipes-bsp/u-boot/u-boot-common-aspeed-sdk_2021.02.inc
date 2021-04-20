HOMEPAGE = "https://github.com/AspeedTech-BMC/u-boot"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"
PE = "1"

# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "ca6ce63b18f763c5b0d990637fc761264a9743ad"

SRC_URI = "git://git@github.com/shenki/u-boot.git;branch=aspeed-hace-v2;protocol=https"

S = "${WORKDIR}/git"

PV = "v2021.02+git${SRCPV}"
