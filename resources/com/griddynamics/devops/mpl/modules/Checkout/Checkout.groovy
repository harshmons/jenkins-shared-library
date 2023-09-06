/**
 * Common checkout module
 */

if( CFG.'git.url' )
  println "[Master Shared Library] : IF block from Checkout.groovy "
  MPLModule('Git Checkout', CFG)
else
  println "[Master Shared Library] : ELSE block from Checkout.groovy "
  MPLModule('Default Checkout', CFG)
