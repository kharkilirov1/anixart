package com.swiftsoft.anixartd.p015ui.logic.main.report;

import com.swiftsoft.anixartd.database.entity.ReportReason;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReportUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/report/ReportUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReportUiLogic extends UiLogic {

    /* renamed from: b */
    public Serializable f29329b;

    /* renamed from: c */
    public int f29330c = -1;

    /* renamed from: d */
    @NotNull
    public List<ReportReason> f29331d = new ArrayList();

    /* renamed from: e */
    public boolean f29332e;

    /* compiled from: ReportUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/report/ReportUiLogic$Companion;", "", "", "REPORT_TYPE_COLLECTION", "I", "REPORT_TYPE_COLLECTION_COMMENT", "REPORT_TYPE_EPISODE", "REPORT_TYPE_PROFILE", "REPORT_TYPE_RELEASE", "REPORT_TYPE_RELEASE_COMMENT", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @NotNull
    /* renamed from: a */
    public final Serializable m15704a() {
        Serializable serializable = this.f29329b;
        if (serializable != null) {
            return serializable;
        }
        Intrinsics.m32189r("targetEntity");
        throw null;
    }
}
