package com.swiftsoft.anixartd.parser.anilibria.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Hls.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/anilibria/entity/Hls;", "", "fhd", "", "hd", "sd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFhd", "()Ljava/lang/String;", "getHd", "getSd", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class Hls {

    @Nullable
    private final String fhd;

    @Nullable
    private final String hd;

    @Nullable
    private final String sd;

    public Hls(@JsonProperty("fhd") @Nullable String str, @JsonProperty("hd") @Nullable String str2, @JsonProperty("sd") @Nullable String str3) {
        this.fhd = str;
        this.hd = str2;
        this.sd = str3;
    }

    @Nullable
    public final String getFhd() {
        return this.fhd;
    }

    @Nullable
    public final String getHd() {
        return this.hd;
    }

    @Nullable
    public final String getSd() {
        return this.sd;
    }
}
