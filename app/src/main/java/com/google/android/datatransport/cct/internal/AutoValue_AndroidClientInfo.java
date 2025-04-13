package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_AndroidClientInfo extends AndroidClientInfo {

    /* renamed from: a */
    public final Integer f9012a;

    /* renamed from: b */
    public final String f9013b;

    /* renamed from: c */
    public final String f9014c;

    /* renamed from: d */
    public final String f9015d;

    /* renamed from: e */
    public final String f9016e;

    /* renamed from: f */
    public final String f9017f;

    /* renamed from: g */
    public final String f9018g;

    /* renamed from: h */
    public final String f9019h;

    /* renamed from: i */
    public final String f9020i;

    /* renamed from: j */
    public final String f9021j;

    /* renamed from: k */
    public final String f9022k;

    /* renamed from: l */
    public final String f9023l;

    public static final class Builder extends AndroidClientInfo.Builder {

        /* renamed from: a */
        public Integer f9024a;

        /* renamed from: b */
        public String f9025b;

        /* renamed from: c */
        public String f9026c;

        /* renamed from: d */
        public String f9027d;

        /* renamed from: e */
        public String f9028e;

        /* renamed from: f */
        public String f9029f;

        /* renamed from: g */
        public String f9030g;

        /* renamed from: h */
        public String f9031h;

        /* renamed from: i */
        public String f9032i;

        /* renamed from: j */
        public String f9033j;

        /* renamed from: k */
        public String f9034k;

        /* renamed from: l */
        public String f9035l;

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: a */
        public AndroidClientInfo mo5423a() {
            return new AutoValue_AndroidClientInfo(this.f9024a, this.f9025b, this.f9026c, this.f9027d, this.f9028e, this.f9029f, this.f9030g, this.f9031h, this.f9032i, this.f9033j, this.f9034k, this.f9035l, null);
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: b */
        public AndroidClientInfo.Builder mo5424b(@Nullable String str) {
            this.f9035l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: c */
        public AndroidClientInfo.Builder mo5425c(@Nullable String str) {
            this.f9033j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: d */
        public AndroidClientInfo.Builder mo5426d(@Nullable String str) {
            this.f9027d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: e */
        public AndroidClientInfo.Builder mo5427e(@Nullable String str) {
            this.f9031h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: f */
        public AndroidClientInfo.Builder mo5428f(@Nullable String str) {
            this.f9026c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: g */
        public AndroidClientInfo.Builder mo5429g(@Nullable String str) {
            this.f9032i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: h */
        public AndroidClientInfo.Builder mo5430h(@Nullable String str) {
            this.f9030g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: i */
        public AndroidClientInfo.Builder mo5431i(@Nullable String str) {
            this.f9034k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: j */
        public AndroidClientInfo.Builder mo5432j(@Nullable String str) {
            this.f9025b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: k */
        public AndroidClientInfo.Builder mo5433k(@Nullable String str) {
            this.f9029f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: l */
        public AndroidClientInfo.Builder mo5434l(@Nullable String str) {
            this.f9028e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        /* renamed from: m */
        public AndroidClientInfo.Builder mo5435m(@Nullable Integer num) {
            this.f9024a = num;
            return this;
        }
    }

    public AutoValue_AndroidClientInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, C09001 c09001) {
        this.f9012a = num;
        this.f9013b = str;
        this.f9014c = str2;
        this.f9015d = str3;
        this.f9016e = str4;
        this.f9017f = str5;
        this.f9018g = str6;
        this.f9019h = str7;
        this.f9020i = str8;
        this.f9021j = str9;
        this.f9022k = str10;
        this.f9023l = str11;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: b */
    public String mo5411b() {
        return this.f9023l;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: c */
    public String mo5412c() {
        return this.f9021j;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: d */
    public String mo5413d() {
        return this.f9015d;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: e */
    public String mo5414e() {
        return this.f9019h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidClientInfo)) {
            return false;
        }
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        Integer num = this.f9012a;
        if (num != null ? num.equals(androidClientInfo.mo5422m()) : androidClientInfo.mo5422m() == null) {
            String str = this.f9013b;
            if (str != null ? str.equals(androidClientInfo.mo5419j()) : androidClientInfo.mo5419j() == null) {
                String str2 = this.f9014c;
                if (str2 != null ? str2.equals(androidClientInfo.mo5415f()) : androidClientInfo.mo5415f() == null) {
                    String str3 = this.f9015d;
                    if (str3 != null ? str3.equals(androidClientInfo.mo5413d()) : androidClientInfo.mo5413d() == null) {
                        String str4 = this.f9016e;
                        if (str4 != null ? str4.equals(androidClientInfo.mo5421l()) : androidClientInfo.mo5421l() == null) {
                            String str5 = this.f9017f;
                            if (str5 != null ? str5.equals(androidClientInfo.mo5420k()) : androidClientInfo.mo5420k() == null) {
                                String str6 = this.f9018g;
                                if (str6 != null ? str6.equals(androidClientInfo.mo5417h()) : androidClientInfo.mo5417h() == null) {
                                    String str7 = this.f9019h;
                                    if (str7 != null ? str7.equals(androidClientInfo.mo5414e()) : androidClientInfo.mo5414e() == null) {
                                        String str8 = this.f9020i;
                                        if (str8 != null ? str8.equals(androidClientInfo.mo5416g()) : androidClientInfo.mo5416g() == null) {
                                            String str9 = this.f9021j;
                                            if (str9 != null ? str9.equals(androidClientInfo.mo5412c()) : androidClientInfo.mo5412c() == null) {
                                                String str10 = this.f9022k;
                                                if (str10 != null ? str10.equals(androidClientInfo.mo5418i()) : androidClientInfo.mo5418i() == null) {
                                                    String str11 = this.f9023l;
                                                    if (str11 == null) {
                                                        if (androidClientInfo.mo5411b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(androidClientInfo.mo5411b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: f */
    public String mo5415f() {
        return this.f9014c;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: g */
    public String mo5416g() {
        return this.f9020i;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: h */
    public String mo5417h() {
        return this.f9018g;
    }

    public int hashCode() {
        Integer num = this.f9012a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f9013b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9014c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9015d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f9016e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f9017f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f9018g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f9019h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f9020i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f9021j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f9022k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f9023l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: i */
    public String mo5418i() {
        return this.f9022k;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: j */
    public String mo5419j() {
        return this.f9013b;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: k */
    public String mo5420k() {
        return this.f9017f;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: l */
    public String mo5421l() {
        return this.f9016e;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    /* renamed from: m */
    public Integer mo5422m() {
        return this.f9012a;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("AndroidClientInfo{sdkVersion=");
        m24u.append(this.f9012a);
        m24u.append(", model=");
        m24u.append(this.f9013b);
        m24u.append(", hardware=");
        m24u.append(this.f9014c);
        m24u.append(", device=");
        m24u.append(this.f9015d);
        m24u.append(", product=");
        m24u.append(this.f9016e);
        m24u.append(", osBuild=");
        m24u.append(this.f9017f);
        m24u.append(", manufacturer=");
        m24u.append(this.f9018g);
        m24u.append(", fingerprint=");
        m24u.append(this.f9019h);
        m24u.append(", locale=");
        m24u.append(this.f9020i);
        m24u.append(", country=");
        m24u.append(this.f9021j);
        m24u.append(", mccMnc=");
        m24u.append(this.f9022k);
        m24u.append(", applicationBuild=");
        return C0000a.m20q(m24u, this.f9023l, "}");
    }
}
