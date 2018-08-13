SUMMARY = "ASPEED LPC Host Interface Control tool"
DESCRIPTION = "Configures the BMC to expose memory regions to the host"
PR = "r1"

inherit obmc-phosphor-license
inherit obmc-phosphor-systemd

inherit autotools

S = "${WORKDIR}/git"

SYSTEMD_SERVICE_${PN} += "pnorboot.service"

SRC_URI += "git://github.com/shenki/aspeed-lpc-control"
SRCREV = "b746730f8b41220dbffc7e404b56508e27ffdfcc"
