# amount-formatter

The goal of this little library is to format in the simplest way amounts inside a jasper report template.

### String getLabel(String currency);
It returns the label of a currency (e.g. €, £)
### String format(String currency, String amount);
It returns a formatted String representing the price (label included)


* To build .jar: `mvn package`  
* To local install the dependency: `mvn install:install-file -Dfile=../amount-formatter/target/amount-formatter-1.0-SNAPSHOT.jar -DgroupId=com.byte-code.amount-formatter -DartifactId=amount-formatter -Dversion=1.0-SNAPSHOT -Dpackaging=jar`  
* To include from JitPack: https://jitpack.io/#Byte-Code/amount-formatter/1.0.0
