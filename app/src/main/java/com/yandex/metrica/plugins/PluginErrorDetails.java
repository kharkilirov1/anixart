package com.yandex.metrica.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3658U2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class PluginErrorDetails {

    /* renamed from: a */
    @Nullable
    public final String f47193a;

    /* renamed from: b */
    @Nullable
    public final String f47194b;

    /* renamed from: c */
    @NonNull
    public final List<StackTraceItem> f47195c;

    /* renamed from: d */
    @Nullable
    public final String f47196d;

    /* renamed from: e */
    @Nullable
    public final String f47197e;

    /* renamed from: f */
    @NonNull
    public final Map<String, String> f47198f;

    public static class Builder {

        /* renamed from: a */
        @Nullable
        public String f47199a;

        /* renamed from: b */
        @Nullable
        public String f47200b;

        /* renamed from: c */
        @Nullable
        public List<StackTraceItem> f47201c;

        /* renamed from: d */
        @Nullable
        public String f47202d;

        /* renamed from: e */
        @Nullable
        public String f47203e;

        /* renamed from: f */
        @Nullable
        public Map<String, String> f47204f;

        @NonNull
        public PluginErrorDetails build() {
            String str = this.f47199a;
            String str2 = this.f47200b;
            List<StackTraceItem> list = this.f47201c;
            List<StackTraceItem> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList = list;
            }
            String str3 = this.f47202d;
            String str4 = this.f47203e;
            Map<String, String> map = this.f47204f;
            Map<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap = map;
            }
            return new PluginErrorDetails(str, str2, arrayList, str3, str4, hashMap, null);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String str) {
            this.f47199a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String str) {
            this.f47200b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String str) {
            this.f47202d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f47204f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.f47201c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String str) {
            this.f47203e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, C4485a c4485a) {
        this.f47193a = str;
        this.f47194b = str2;
        this.f47195c = new ArrayList(list);
        this.f47196d = str3;
        this.f47197e = str4;
        this.f47198f = C3658U2.m19205a(C3658U2.m19203a(map));
    }

    @Nullable
    public String getExceptionClass() {
        return this.f47193a;
    }

    @Nullable
    public String getMessage() {
        return this.f47194b;
    }

    @Nullable
    public String getPlatform() {
        return this.f47196d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f47198f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f47195c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.f47197e;
    }
}
