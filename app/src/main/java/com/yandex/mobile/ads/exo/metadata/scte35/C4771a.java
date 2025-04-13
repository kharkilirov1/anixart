package com.yandex.mobile.ads.exo.metadata.scte35;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.g11;
import com.yandex.mobile.ads.impl.p61;
import com.yandex.mobile.ads.impl.yd0;
import com.yandex.mobile.ads.impl.zo0;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.a */
/* loaded from: classes2.dex */
public final class C4771a extends g11 {

    /* renamed from: a */
    private final ap0 f48176a = new ap0();

    /* renamed from: b */
    private final zo0 f48177b = new zo0();

    /* renamed from: c */
    private p61 f48178c;

    @Override // com.yandex.mobile.ads.impl.g11
    /* renamed from: a */
    public final Metadata mo22267a(yd0 yd0Var, ByteBuffer byteBuffer) {
        p61 p61Var = this.f48178c;
        if (p61Var == null || yd0Var.f56802i != p61Var.m27174c()) {
            p61 p61Var2 = new p61(yd0Var.f54759e);
            this.f48178c = p61Var2;
            p61Var2.m27171a(yd0Var.f54759e - yd0Var.f56802i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f48176a.m22582a(limit, array);
        this.f48177b.m30249a(limit, array);
        this.f48177b.m30257d(39);
        long m30252b = (this.f48177b.m30252b(1) << 32) | this.f48177b.m30252b(32);
        this.f48177b.m30257d(20);
        int m30252b2 = this.f48177b.m30252b(12);
        int m30252b3 = this.f48177b.m30252b(8);
        Metadata.Entry entry = null;
        this.f48176a.m22593f(14);
        if (m30252b3 == 0) {
            entry = new SpliceNullCommand();
        } else if (m30252b3 == 255) {
            entry = PrivateCommand.m22258a(this.f48176a, m30252b2, m30252b);
        } else if (m30252b3 == 4) {
            entry = SpliceScheduleCommand.m22261a(this.f48176a);
        } else if (m30252b3 == 5) {
            entry = SpliceInsertCommand.m22259a(this.f48176a, m30252b, this.f48178c);
        } else if (m30252b3 == 6) {
            entry = TimeSignalCommand.m22266a(this.f48176a, m30252b, this.f48178c);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
