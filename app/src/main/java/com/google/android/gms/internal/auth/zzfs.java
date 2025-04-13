package com.google.android.gms.internal.auth;

import com.fasterxml.jackson.core.JsonFactory;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfs {
    /* renamed from: a */
    public static final void m8434a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8434a(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8434a(sb, i2, str, (Map.Entry) it2.next());
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
            zzeb zzebVar = zzeb.f16083c;
            sb.append(zzgn.m8483a(new zzdz(((String) obj).getBytes(zzev.f16107a))));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzeb) {
            sb.append(": \"");
            sb.append(zzgn.m8483a((zzeb) obj));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzeq) {
            sb.append(" {");
            m8436c((zzeq) obj, sb, i2 + 2);
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
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        m8434a(sb, i5, "key", entry.getKey());
        m8434a(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    /* renamed from: b */
    public static final String m8435b(String str) {
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
    public static void m8436c(zzfq zzfqVar, StringBuilder sb, int i2) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzfqVar.getClass().getDeclaredMethods()) {
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
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m8434a(sb, i2, m8435b(concat), zzeq.m8403b(method2, zzfqVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m8434a(sb, i2, m8435b(concat2), zzeq.m8403b(method3, zzfqVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object m8403b = zzeq.m8403b(method4, zzfqVar, new Object[0]);
                    if (method5 == null) {
                        if (m8403b instanceof Boolean) {
                            if (((Boolean) m8403b).booleanValue()) {
                                m8434a(sb, i2, m8435b(concat3), m8403b);
                            }
                        } else if (m8403b instanceof Integer) {
                            if (((Integer) m8403b).intValue() != 0) {
                                m8434a(sb, i2, m8435b(concat3), m8403b);
                            }
                        } else if (m8403b instanceof Float) {
                            if (((Float) m8403b).floatValue() != 0.0f) {
                                m8434a(sb, i2, m8435b(concat3), m8403b);
                            }
                        } else if (!(m8403b instanceof Double)) {
                            if (m8403b instanceof String) {
                                equals = m8403b.equals("");
                            } else if (m8403b instanceof zzeb) {
                                equals = m8403b.equals(zzeb.f16083c);
                            } else if (!(m8403b instanceof zzfq)) {
                                if ((m8403b instanceof Enum) && ((Enum) m8403b).ordinal() == 0) {
                                }
                                m8434a(sb, i2, m8435b(concat3), m8403b);
                            } else if (m8403b != ((zzfq) m8403b).mo8401k()) {
                                m8434a(sb, i2, m8435b(concat3), m8403b);
                            }
                            if (!equals) {
                                m8434a(sb, i2, m8435b(concat3), m8403b);
                            }
                        } else if (((Double) m8403b).doubleValue() != 0.0d) {
                            m8434a(sb, i2, m8435b(concat3), m8403b);
                        }
                    } else if (((Boolean) zzeq.m8403b(method5, zzfqVar, new Object[0])).booleanValue()) {
                        m8434a(sb, i2, m8435b(concat3), m8403b);
                    }
                }
            }
        }
        if (zzfqVar instanceof zzep) {
            throw null;
        }
        zzgq zzgqVar = ((zzeq) zzfqVar).zzc;
        if (zzgqVar != null) {
            for (int i3 = 0; i3 < zzgqVar.f16171a; i3++) {
                m8434a(sb, i2, String.valueOf(zzgqVar.f16172b[i3] >>> 3), zzgqVar.f16173c[i3]);
            }
        }
    }
}
