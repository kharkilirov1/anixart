package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.internal.zzag;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzy {

    /* renamed from: c */
    public static final zzag f20264c = new zzag("LocalTestingConfigParser");

    /* renamed from: a */
    public final XmlPullParser f20265a;

    /* renamed from: b */
    public final zzs f20266b;

    public zzy(XmlPullParser xmlPullParser) {
        this.f20265a = xmlPullParser;
        zzt zztVar = zzt.f20260a;
        zza zzaVar = new zza();
        zzaVar.f20232b = new HashMap();
        this.f20266b = zzaVar;
    }

    /* renamed from: a */
    public static zzt m10987a(File file) {
        File file2 = new File((File) null, "local_testing_config.xml");
        if (!file2.exists()) {
            return zzt.f20260a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                final zzy zzyVar = new zzy(newPullParser);
                zzyVar.m10988b("local-testing-config", new zzx() { // from class: com.google.android.play.core.splitinstall.testing.zzu
                    @Override // com.google.android.play.core.splitinstall.testing.zzx
                    /* renamed from: u */
                    public final void mo10986u() {
                        final zzy zzyVar2 = zzy.this;
                        Objects.requireNonNull(zzyVar2);
                        zzyVar2.m10988b("split-install-errors", new zzx() { // from class: com.google.android.play.core.splitinstall.testing.zzv
                            @Override // com.google.android.play.core.splitinstall.testing.zzx
                            /* renamed from: u */
                            public final void mo10986u() {
                                final zzy zzyVar3 = zzy.this;
                                for (int i2 = 0; i2 < zzyVar3.f20265a.getAttributeCount(); i2++) {
                                    if ("defaultErrorCode".equals(zzyVar3.f20265a.getAttributeName(i2))) {
                                        zzyVar3.f20266b.mo10976a(com.google.android.play.core.splitinstall.model.zza.m10971a(zzyVar3.f20265a.getAttributeValue(i2)));
                                    }
                                }
                                zzyVar3.m10988b("split-install-error", new zzx() { // from class: com.google.android.play.core.splitinstall.testing.zzw
                                    @Override // com.google.android.play.core.splitinstall.testing.zzx
                                    /* renamed from: u */
                                    public final void mo10986u() {
                                        zzy zzyVar4 = zzy.this;
                                        String str = null;
                                        String str2 = null;
                                        for (int i3 = 0; i3 < zzyVar4.f20265a.getAttributeCount(); i3++) {
                                            if ("module".equals(zzyVar4.f20265a.getAttributeName(i3))) {
                                                str = zzyVar4.f20265a.getAttributeValue(i3);
                                            }
                                            if ("errorCode".equals(zzyVar4.f20265a.getAttributeName(i3))) {
                                                str2 = zzyVar4.f20265a.getAttributeValue(i3);
                                            }
                                        }
                                        if (str == null || str2 == null) {
                                            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), zzyVar4.f20265a, null);
                                        }
                                        zzyVar4.f20266b.mo10979d().put(str, Integer.valueOf(com.google.android.play.core.splitinstall.model.zza.m10971a(str2)));
                                        while (zzyVar4.f20265a.next() != 3) {
                                        }
                                    }
                                });
                            }
                        });
                    }
                });
                zzs zzsVar = zzyVar.f20266b;
                zzsVar.mo10977b(Collections.unmodifiableMap(zzsVar.mo10979d()));
                zzt mo10978c = zzsVar.mo10978c();
                fileReader.close();
                return mo10978c;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e2) {
            f20264c.m10838e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e2.getMessage());
            return zzt.f20260a;
        }
    }

    /* renamed from: b */
    public final void m10988b(String str, zzx zzxVar) throws IOException, XmlPullParserException {
        while (true) {
            int next = this.f20265a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.f20265a.getEventType() == 2) {
                if (!this.f20265a.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f20265a.getName()), this.f20265a, null);
                }
                zzxVar.mo10986u();
            }
        }
    }
}
