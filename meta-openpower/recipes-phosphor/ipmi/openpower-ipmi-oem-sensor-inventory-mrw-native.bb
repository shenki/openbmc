SUMMARY = "OEM sensor config for phosphor-host-ipmid"
PR = "r1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit phosphor-ipmi-host
inherit native

SRC_URI += "file://openpower-config.yaml"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
        DEST=${D}${sensor_yamldir}
        install -d ${DEST}
        install openpower-config.yaml ${DEST}/openpower-config.yaml
}
