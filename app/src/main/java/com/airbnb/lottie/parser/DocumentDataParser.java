package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class DocumentDataParser implements ValueParser<DocumentData> {

    /* renamed from: a */
    public static final DocumentDataParser f7732a = new DocumentDataParser();

    /* renamed from: b */
    public static final JsonReader.Options f7733b = JsonReader.Options.m4804a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public DocumentData mo4775a(JsonReader jsonReader, float f2) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.mo4788b();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f3 = 0.0f;
        int i2 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        float f6 = 0.0f;
        boolean z = true;
        while (jsonReader.mo4791g()) {
            switch (jsonReader.mo4799p(f7733b)) {
                case 0:
                    str = jsonReader.mo4796l();
                    break;
                case 1:
                    str2 = jsonReader.mo4796l();
                    break;
                case 2:
                    f3 = (float) jsonReader.mo4793i();
                    break;
                case 3:
                    int mo4794j = jsonReader.mo4794j();
                    if (mo4794j <= 2 && mo4794j >= 0) {
                        justification2 = DocumentData.Justification.values()[mo4794j];
                        break;
                    } else {
                        justification2 = justification;
                        break;
                    }
                case 4:
                    i2 = jsonReader.mo4794j();
                    break;
                case 5:
                    f4 = (float) jsonReader.mo4793i();
                    break;
                case 6:
                    f5 = (float) jsonReader.mo4793i();
                    break;
                case 7:
                    i3 = JsonUtils.m4777a(jsonReader);
                    break;
                case 8:
                    i4 = JsonUtils.m4777a(jsonReader);
                    break;
                case 9:
                    f6 = (float) jsonReader.mo4793i();
                    break;
                case 10:
                    z = jsonReader.mo4792h();
                    break;
                default:
                    jsonReader.mo4800q();
                    jsonReader.mo4802u();
                    break;
            }
        }
        jsonReader.mo4790e();
        return new DocumentData(str, str2, f3, justification2, i2, f4, f5, i3, i4, f6, z);
    }
}
