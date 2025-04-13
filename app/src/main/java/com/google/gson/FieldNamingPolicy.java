package com.google.gson;

import androidx.emoji2.text.flatbuffer.C0321a;
import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum FieldNamingPolicy implements FieldNamingStrategy {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
        @Override // com.google.gson.FieldNamingStrategy
        /* renamed from: a */
        public String mo12829a(Field field) {
            return field.getName();
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
        @Override // com.google.gson.FieldNamingStrategy
        /* renamed from: a */
        public String mo12829a(Field field) {
            return FieldNamingPolicy.m12828c(field.getName());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
        @Override // com.google.gson.FieldNamingStrategy
        /* renamed from: a */
        public String mo12829a(Field field) {
            return FieldNamingPolicy.m12828c(FieldNamingPolicy.m12827b(field.getName(), " "));
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
        @Override // com.google.gson.FieldNamingStrategy
        /* renamed from: a */
        public String mo12829a(Field field) {
            return FieldNamingPolicy.m12827b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.5
        @Override // com.google.gson.FieldNamingStrategy
        /* renamed from: a */
        public String mo12829a(Field field) {
            return FieldNamingPolicy.m12827b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.6
        @Override // com.google.gson.FieldNamingStrategy
        /* renamed from: a */
        public String mo12829a(Field field) {
            return FieldNamingPolicy.m12827b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    FieldNamingPolicy(C22331 c22331) {
    }

    /* renamed from: b */
    public static String m12827b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m12828c(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char charAt = str.charAt(i2);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i2 == 0) {
            StringBuilder m2872a = C0321a.m2872a(upperCase);
            m2872a.append(str.substring(1));
            return m2872a.toString();
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }
}
