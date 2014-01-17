# iruboto 

Minimal [Ruboto](http://ruboto.org/) IRB environment in ADB SHELL.

## Usage

```bash
#build iruboto, place sources in android source tree
mmm iruboto

#deploy
adb shell mkdir /data/ruby
adb push out/target/product/PRODUCT_NAME/system/framework/iruboto.jar /data/ruby

#run
adb shell
CLASSPATH=/data/ruby/iruboto.jar app_process /system/bin org.ruboto.run

```
