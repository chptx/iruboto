# Copyright 2007 The Android Open Source Project
#
LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := $(call all-subdir-java-files)
LOCAL_MODULE := iruboto
LOCAL_STATIC_JAVA_LIBRARIES := libjrcore libjrlib
LOCAL_PROGUARD_FLAG_FILES := proguard.flags
include $(BUILD_JAVA_LIBRARY)

include $(CLEAR_VARS)

LOCAL_PREBUILT_STATIC_JAVA_LIBRARIES := libjrcore:jruby-core-1.7.4.jar libjrlib:jruby-stdlib-1.7.4.jar

include $(BUILD_MULTI_PREBUILT)

