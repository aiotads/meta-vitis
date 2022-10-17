DESCRIPTION = "Vitis Video Analytics SDK (VVAS) packages"

inherit packagegroup

PROVIDES = "packagegroup-petalinux-vvas"

VVAS_PACKAGES = " \
	vvas-accel-libs \
	vvas-gst \
	vvas-utils \
	"

RDEPENDS:${PN} = "${VVAS_PACKAGES}"
RREPLACES:${PN} = "packagegroup-petalinux-vvas"