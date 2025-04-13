package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public class BeanUtil {
    public static Object getDefaultValue(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> primitiveType = ClassUtil.primitiveType(rawClass);
        if (primitiveType != null) {
            return ClassUtil.defaultValue(primitiveType);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    public static boolean isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        String packageName;
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType.isArray() && (packageName = ClassUtil.getPackageName(rawType.getComponentType())) != null && packageName.contains(".cglib")) {
            return packageName.startsWith("net.sf.cglib") || packageName.startsWith("org.hibernate.repackage.cglib") || packageName.startsWith("org.springframework.cglib");
        }
        return false;
    }

    public static boolean isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawType());
        return packageName != null && packageName.startsWith("groovy.lang");
    }

    public static boolean isGroovyMetaClassSetter(AnnotatedMethod annotatedMethod) {
        String packageName = ClassUtil.getPackageName(annotatedMethod.getRawParameterType(0));
        return packageName != null && packageName.startsWith("groovy.lang");
    }

    public static String legacyManglePropertyName(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char charAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        while (true) {
            i2++;
            if (i2 >= length) {
                break;
            }
            char charAt2 = str.charAt(i2);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append((CharSequence) str, i2, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String okNameForGetter(AnnotatedMethod annotatedMethod, boolean z) {
        String name = annotatedMethod.getName();
        String okNameForIsGetter = okNameForIsGetter(annotatedMethod, name, z);
        return okNameForIsGetter == null ? okNameForRegularGetter(annotatedMethod, name, z) : okNameForIsGetter;
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType == Boolean.class || rawType == Boolean.TYPE) {
            return z ? stdManglePropertyName(str, 2) : legacyManglePropertyName(str, 2);
        }
        return null;
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String name = annotatedMethod.getName();
        if (name.startsWith(str)) {
            return z ? stdManglePropertyName(name, str.length()) : legacyManglePropertyName(name, str.length());
        }
        return null;
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        return z ? stdManglePropertyName(str, 3) : legacyManglePropertyName(str, 3);
    }

    @Deprecated
    public static String okNameForSetter(AnnotatedMethod annotatedMethod, boolean z) {
        String okNameForMutator = okNameForMutator(annotatedMethod, "set", z);
        if (okNameForMutator == null) {
            return null;
        }
        if ("metaClass".equals(okNameForMutator) && isGroovyMetaClassSetter(annotatedMethod)) {
            return null;
        }
        return okNameForMutator;
    }

    public static String stdManglePropertyName(String str, int i2) {
        int length = str.length();
        if (length == i2) {
            return null;
        }
        char charAt = str.charAt(i2);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i2);
        }
        int i3 = i2 + 1;
        if (i3 < length && Character.isUpperCase(str.charAt(i3))) {
            return str.substring(i2);
        }
        StringBuilder sb = new StringBuilder(length - i2);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i3, length);
        return sb.toString();
    }
}
