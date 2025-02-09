SUMMARY = "An efficient and agile neural network intent parser. Padatious is a core component of Mycroft AI."
HOMEPAGE = "https://github.com/MycroftAI/padatious"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.md;md5=cc85c733dffe81e8a7fde2e8f8a6a404"

SRC_URI[sha256sum] = "e471f251b94e8cadf6e4214f0f3b7b36678848aaa8c51cd5638ab23ecb716f75"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
    python3-fann2 \
    python3-json \
    python3-multiprocessing \
    python3-padaos \
    python3-xxhash \
"
