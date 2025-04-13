package com.yandex.metrica.impl.p023ob;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p023ob.C3298Fg;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.Hg */
/* loaded from: classes2.dex */
class CallableC3348Hg implements Callable<C3298Fg> {

    /* renamed from: a */
    public final /* synthetic */ C3373Ig f43056a;

    public CallableC3348Hg(C3373Ig c3373Ig) {
        this.f43056a = c3373Ig;
    }

    @Override // java.util.concurrent.Callable
    public C3298Fg call() throws Exception {
        Context context;
        Context context2;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        Cursor cursor5;
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        context = this.f43056a.f43126a;
        ContentResolver contentResolver = context.getContentResolver();
        C3373Ig c3373Ig = this.f43056a;
        context2 = c3373Ig.f43126a;
        c3373Ig.f43127b = contentResolver.query(parse, null, null, new String[]{context2.getPackageName()}, null);
        cursor = this.f43056a.f43127b;
        if (cursor != null) {
            cursor2 = this.f43056a.f43127b;
            if (cursor2.moveToFirst()) {
                cursor3 = this.f43056a.f43127b;
                String string = cursor3.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    cursor4 = this.f43056a.f43127b;
                    long j2 = cursor4.getLong(1);
                    cursor5 = this.f43056a.f43127b;
                    return new C3298Fg(string, j2, cursor5.getLong(2), C3298Fg.a.HMS);
                }
            }
        }
        return null;
    }
}
