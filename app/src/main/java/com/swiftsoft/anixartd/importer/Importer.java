package com.swiftsoft.anixartd.importer;

import android.content.Context;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Importer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/importer/Importer;", "Ljava/io/Serializable;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class Importer implements Serializable {

    /* renamed from: b */
    @NotNull
    public HashSet<Long> f25760b;

    /* renamed from: c */
    @NotNull
    public HashSet<Long> f25761c;

    /* renamed from: d */
    @NotNull
    public HashSet<Long> f25762d;

    /* renamed from: e */
    @NotNull
    public HashSet<Long> f25763e;

    /* renamed from: f */
    @NotNull
    public HashSet<Long> f25764f;

    /* renamed from: g */
    @NotNull
    public HashSet<Long> f25765g;

    /* compiled from: Importer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/importer/Importer$Companion;", "", "", "IMPORTER_NAME_SHIKIMORI", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public Importer() {
        new HashSet();
        this.f25760b = new HashSet<>();
        this.f25761c = new HashSet<>();
        this.f25762d = new HashSet<>();
        this.f25763e = new HashSet<>();
        this.f25764f = new HashSet<>();
        this.f25765g = new HashSet<>();
    }

    /* renamed from: a */
    public abstract void mo14166a(@NotNull Context context, @NotNull Function1<? super Importer, Unit> function1) throws Exception;
}
