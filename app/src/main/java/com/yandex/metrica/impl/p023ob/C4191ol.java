package com.yandex.metrica.impl.p023ob;

import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3727Wl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ol */
/* loaded from: classes2.dex */
public class C4191ol implements InterfaceC3303Fl {

    /* renamed from: a */
    private final Set<Class> f46088a;

    public C4191ol() {
        HashSet hashSet = new HashSet();
        this.f46088a = hashSet;
        hashSet.add(EditText.class);
        hashSet.add(Chronometer.class);
        hashSet.add(DigitalClock.class);
        hashSet.add(TextClock.class);
        hashSet.add(RadioButton.class);
        hashSet.add(CheckBox.class);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    /* renamed from: a */
    public boolean mo17941a(@NonNull TextView textView) {
        TextView textView2 = textView;
        Iterator<Class> it = this.f46088a.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(textView2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    @NonNull
    /* renamed from: a */
    public C3727Wl.b mo17940a() {
        return C3727Wl.b.IRRELEVANT_CLASS;
    }
}
