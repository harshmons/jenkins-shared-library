/**
 * Common build module
 */
println "[Master Shared Library] : From Build.groovy "
MPLModule('Maven Build', CFG)

if( fileExists('openshift') ) {
  MPLModule('Openshift Build', CFG)
}
