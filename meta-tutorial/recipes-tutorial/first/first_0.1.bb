DESCRIPTION = "I am the first recipe"
PR = "r1"
do_build () {
  echo "first: some shell script running as build"
  /opt/parasoft/cpptest_professional-2023.2.0-linux.x86_64/bin/cli/cpptestcli -machineid
  # /opt/parasoft/old/cpptest/10.4/engine/dtp/cpptestcli -machineid
  # /tmp/testrun.sh
}
