package com.yandex.metrica.impl.p023ob;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.f */
/* loaded from: classes2.dex */
public final class C3935f {
    /* renamed from: a */
    public static <T extends AbstractC3909e> String m19832a(T t) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m19834a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e2) {
            StringBuilder m24u = C0000a.m24u("Error printing proto: ");
            m24u.append(e2.getMessage());
            return m24u.toString();
        } catch (InvocationTargetException e3) {
            StringBuilder m24u2 = C0000a.m24u("Error printing proto: ");
            m24u2.append(e3.getMessage());
            return m24u2.toString();
        }
    }

    /* renamed from: a */
    private static void m19834a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj == null) {
            return;
        }
        if (obj instanceof AbstractC3909e) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(m19833a(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if ((modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (type.isArray()) {
                        if (type.getComponentType() == Byte.TYPE) {
                            m19834a(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i2 = 0; i2 < length2; i2++) {
                                m19834a(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    } else {
                        m19834a(name, obj2, stringBuffer, stringBuffer2);
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String substring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            m19834a(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        String m19833a = m19833a(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(m19833a);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith("http") && str2.length() > 200) {
                str2 = str2.substring(0, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER) + "[...]";
            }
            int length3 = str2.length();
            StringBuilder sb = new StringBuilder(length3);
            for (int i3 = 0; i3 < length3; i3++) {
                char charAt = str2.charAt(i3);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                } else {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(sb2);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            stringBuffer2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            for (byte b : (byte[]) obj) {
                int i4 = b & 255;
                if (i4 == 92 || i4 == 34) {
                    stringBuffer2.append('\\');
                    stringBuffer2.append((char) i4);
                } else if (i4 < 32 || i4 >= 127) {
                    stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i4)));
                } else {
                    stringBuffer2.append((char) i4);
                }
            }
            stringBuffer2.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    /* renamed from: a */
    private static String m19833a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}
