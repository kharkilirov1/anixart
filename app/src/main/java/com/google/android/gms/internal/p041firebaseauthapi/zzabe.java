package com.google.android.gms.internal.p041firebaseauthapi;

import com.fasterxml.jackson.core.JsonFactory;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabe {
    /* renamed from: a */
    public static final void m8625a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8625a(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8625a(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            zzyu zzyuVar = zzyu.f17120c;
            sb.append(zzacd.m8740a(new zzyr(((String) obj).getBytes(zzaad.f16259a))));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzyu) {
            sb.append(": \"");
            sb.append(zzacd.m8740a((zzyu) obj));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzzx) {
            sb.append(" {");
            m8627c((zzzx) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        m8625a(sb, i5, "key", entry.getKey());
        m8625a(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    /* renamed from: b */
    public static final String m8626b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m8627c(zzabc zzabcVar, StringBuilder sb, int i2) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzabcVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m8625a(sb, i2, m8626b(concat), zzzx.m9649g(method2, zzabcVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m8625a(sb, i2, m8626b(concat2), zzzx.m9649g(method3, zzabcVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m9649g = zzzx.m9649g(method4, zzabcVar, new Object[0]);
                    if (method5 == null) {
                        if (m9649g instanceof Boolean) {
                            if (((Boolean) m9649g).booleanValue()) {
                                m8625a(sb, i2, m8626b(concat3), m9649g);
                            }
                        } else if (m9649g instanceof Integer) {
                            if (((Integer) m9649g).intValue() != 0) {
                                m8625a(sb, i2, m8626b(concat3), m9649g);
                            }
                        } else if (m9649g instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m9649g).floatValue()) != 0) {
                                m8625a(sb, i2, m8626b(concat3), m9649g);
                            }
                        } else if (!(m9649g instanceof Double)) {
                            if (m9649g instanceof String) {
                                equals = m9649g.equals("");
                            } else if (m9649g instanceof zzyu) {
                                equals = m9649g.equals(zzyu.f17120c);
                            } else if (!(m9649g instanceof zzabc)) {
                                if ((m9649g instanceof Enum) && ((Enum) m9649g).ordinal() == 0) {
                                }
                                m8625a(sb, i2, m8626b(concat3), m9649g);
                            } else if (m9649g != ((zzabc) m9649g).mo8624d()) {
                                m8625a(sb, i2, m8626b(concat3), m9649g);
                            }
                            if (!equals) {
                                m8625a(sb, i2, m8626b(concat3), m9649g);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) m9649g).doubleValue()) != 0) {
                            m8625a(sb, i2, m8626b(concat3), m9649g);
                        }
                    } else if (((Boolean) zzzx.m9649g(method5, zzabcVar, new Object[0])).booleanValue()) {
                        m8625a(sb, i2, m8626b(concat3), m9649g);
                    }
                }
            }
        }
        if (zzabcVar instanceof zzzu) {
            throw null;
        }
        zzacg zzacgVar = ((zzzx) zzabcVar).zzc;
        if (zzacgVar != null) {
            for (int i3 = 0; i3 < zzacgVar.f16346a; i3++) {
                m8625a(sb, i2, String.valueOf(zzacgVar.f16347b[i3] >>> 3), zzacgVar.f16348c[i3]);
            }
        }
    }
}
