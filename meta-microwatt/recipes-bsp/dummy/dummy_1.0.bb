SUMMARY = "Universal Boot Loader"
PROVIDES = "virtual/bootloader"
PROVIDES += "u-boot"

LICENSE = "GPLv3"

do_deploy() {
	dd if=/dev/zero of=${DEPLOY_DIR_IMAGE}/u-boot.bin bs=1M count=1
	dd if=/dev/zero of=${DEPLOY_DIR_IMAGE}/u-boot-env.bin bs=1K count=1

}

addtask deploy
