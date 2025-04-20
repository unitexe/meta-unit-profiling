SUMMARY = "Profiling packages"
AUTHOR = "unitexe"
SECTION = "unit"
LICENSE = "MIT"

inherit packagegroup

# Systemd debugging
RDEPENDS:${PN}:append = " systemd-bootchart"
RDEPENDS:${PN}:append = " systemd-bootchart-conf"
RDEPENDS:${PN}:append = " systemd-analyze"

# Performance analysis
RDEPENDS:${PN}:append = " procps"
RDEPENDS:${PN}:append = " sysstat"

# Performance testing
RDEPENDS:${PN}:append = " stress-ng"
