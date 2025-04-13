package org.jsoup.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;
import org.jsoup.parser.Token;

/* loaded from: classes3.dex */
enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char m34818n = characterReader.m34818n();
            if (m34818n == 0) {
                tokeniser.m34942k(this);
                tokeniser.m34936e(characterReader.m34810f());
                return;
            }
            if (m34818n == '&') {
                tokeniser.m34944m(TokeniserState.CharacterReferenceInData);
                tokeniser.f69175a.m34806a();
            } else if (m34818n == '<') {
                tokeniser.m34944m(TokeniserState.TagOpen);
                tokeniser.f69175a.m34806a();
            } else if (m34818n != 65535) {
                tokeniser.m34937f(characterReader.m34812h());
            } else {
                tokeniser.m34939h(new Token.EOF());
            }
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34945a(tokeniser, TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char m34818n = characterReader.m34818n();
            if (m34818n == 0) {
                tokeniser.m34942k(this);
                characterReader.m34806a();
                tokeniser.m34936e((char) 65533);
            } else if (m34818n == '&') {
                tokeniser.m34944m(TokeniserState.CharacterReferenceInRcdata);
                tokeniser.f69175a.m34806a();
            } else if (m34818n == '<') {
                tokeniser.m34944m(TokeniserState.RcdataLessthanSign);
                tokeniser.f69175a.m34806a();
            } else if (m34818n != 65535) {
                tokeniser.m34937f(characterReader.m34812h());
            } else {
                tokeniser.m34939h(new Token.EOF());
            }
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34945a(tokeniser, TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34946b(tokeniser, characterReader, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34946b(tokeniser, characterReader, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char m34818n = characterReader.m34818n();
            if (m34818n == 0) {
                tokeniser.m34942k(this);
                characterReader.m34806a();
                tokeniser.m34936e((char) 65533);
            } else if (m34818n != 65535) {
                tokeniser.m34937f(characterReader.m34814j((char) 0));
            } else {
                tokeniser.m34939h(new Token.EOF());
            }
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char m34818n = characterReader.m34818n();
            if (m34818n == '!') {
                tokeniser.m34944m(TokeniserState.MarkupDeclarationOpen);
                tokeniser.f69175a.m34806a();
                return;
            }
            if (m34818n == '/') {
                tokeniser.m34944m(TokeniserState.EndTagOpen);
                tokeniser.f69175a.m34806a();
                return;
            }
            if (m34818n == '?') {
                tokeniser.m34934c();
                tokeniser.m34944m(TokeniserState.BogusComment);
            } else if (characterReader.m34829y()) {
                tokeniser.m34935d(true);
                tokeniser.m34944m(TokeniserState.TagName);
            } else {
                tokeniser.m34942k(this);
                tokeniser.m34936e('<');
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            if (characterReader.m34820p()) {
                tokeniser.m34941j(this);
                tokeniser.m34937f("</");
                tokeniser.m34944m(tokeniserState);
            } else if (characterReader.m34829y()) {
                tokeniser.m34935d(false);
                tokeniser.m34944m(TokeniserState.TagName);
            } else if (characterReader.m34827w('>')) {
                tokeniser.m34942k(this);
                tokeniser.m34944m(tokeniserState);
                tokeniser.f69175a.m34806a();
            } else {
                tokeniser.m34942k(this);
                tokeniser.m34934c();
                tokeniser.f69188n.m34901i(JsonPointer.SEPARATOR);
                tokeniser.m34944m(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char c2;
            TokeniserState tokeniserState = TokeniserState.Data;
            characterReader.m34807b();
            int i2 = characterReader.f69021e;
            int i3 = characterReader.f69019c;
            char[] cArr = characterReader.f69017a;
            int i4 = i2;
            while (i4 < i3 && (c2 = cArr[i4]) != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ' && c2 != '/' && c2 != '<' && c2 != '>') {
                i4++;
            }
            characterReader.f69021e = i4;
            tokeniser.f69185k.m34911n(i4 > i2 ? CharacterReader.m34800c(characterReader.f69017a, characterReader.f69024h, i2, i4 - i2) : "");
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.f69185k.m34911n(TokeniserState.f69258s0);
                return;
            }
            if (m34810f != ' ') {
                if (m34810f == '/') {
                    tokeniser.m34944m(TokeniserState.SelfClosingStartTag);
                    return;
                }
                if (m34810f == '<') {
                    characterReader.m34805E();
                    tokeniser.m34942k(this);
                } else if (m34810f != '>') {
                    if (m34810f == 65535) {
                        tokeniser.m34941j(this);
                        tokeniser.m34944m(tokeniserState);
                        return;
                    } else if (m34810f != '\t' && m34810f != '\n' && m34810f != '\f' && m34810f != '\r') {
                        tokeniser.f69185k.m34910m(m34810f);
                        return;
                    }
                }
                tokeniser.m34940i();
                tokeniser.m34944m(tokeniserState);
                return;
            }
            tokeniser.m34944m(TokeniserState.BeforeAttributeName);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        
            if (r1 >= r8.f69021e) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo34950f(org.jsoup.parser.Tokeniser r7, org.jsoup.parser.CharacterReader r8) {
            /*
                r6 = this;
                r0 = 47
                boolean r0 = r8.m34827w(r0)
                if (r0 == 0) goto L19
                java.lang.StringBuilder r8 = r7.f69182h
                org.jsoup.parser.Token.m34893h(r8)
                org.jsoup.parser.TokeniserState r8 = org.jsoup.parser.TokeniserState.RCDATAEndTagOpen
                r7.m34944m(r8)
                org.jsoup.parser.CharacterReader r7 = r7.f69175a
                r7.m34806a()
                goto L98
            L19:
                boolean r0 = r8.m34829y()
                if (r0 == 0) goto L8e
                java.lang.String r0 = r7.f69189o
                if (r0 == 0) goto L8e
                java.lang.String r0 = r7.f69190p
                if (r0 != 0) goto L38
                java.lang.String r0 = "</"
                java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
                java.lang.String r1 = r7.f69189o
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.f69190p = r0
            L38:
                java.lang.String r0 = r7.f69190p
                java.lang.String r1 = r8.f69028l
                boolean r1 = r0.equals(r1)
                r2 = -1
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L50
                int r1 = r8.f69029m
                if (r1 != r2) goto L4b
                r3 = 0
                goto L78
            L4b:
                int r5 = r8.f69021e
                if (r1 < r5) goto L50
                goto L78
            L50:
                r8.f69028l = r0
                java.util.Locale r1 = java.util.Locale.ENGLISH
                java.lang.String r5 = r0.toLowerCase(r1)
                int r5 = r8.m34801A(r5)
                if (r5 <= r2) goto L64
                int r0 = r8.f69021e
                int r0 = r0 + r5
                r8.f69029m = r0
                goto L78
            L64:
                java.lang.String r0 = r0.toUpperCase(r1)
                int r0 = r8.m34801A(r0)
                if (r0 <= r2) goto L6f
                goto L70
            L6f:
                r3 = 0
            L70:
                if (r3 == 0) goto L76
                int r1 = r8.f69021e
                int r2 = r1 + r0
            L76:
                r8.f69029m = r2
            L78:
                if (r3 != 0) goto L8e
                org.jsoup.parser.Token$Tag r8 = r7.m34935d(r4)
                java.lang.String r0 = r7.f69189o
                r8.m34916s(r0)
                r7.f69185k = r8
                r7.m34940i()
                org.jsoup.parser.TokeniserState r8 = org.jsoup.parser.TokeniserState.TagOpen
                r7.m34944m(r8)
                goto L98
            L8e:
                java.lang.String r8 = "<"
                r7.m34937f(r8)
                org.jsoup.parser.TokeniserState r8 = org.jsoup.parser.TokeniserState.Rcdata
                r7.m34944m(r8)
            L98:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokeniserState.C690711.mo34950f(org.jsoup.parser.Tokeniser, org.jsoup.parser.CharacterReader):void");
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.m34829y()) {
                tokeniser.m34937f("</");
                tokeniser.m34944m(TokeniserState.Rcdata);
                return;
            }
            tokeniser.m34935d(false);
            tokeniser.f69185k.m34910m(characterReader.m34818n());
            tokeniser.f69182h.append(characterReader.m34818n());
            tokeniser.m34944m(TokeniserState.RCDATAEndTagName);
            tokeniser.f69175a.m34806a();
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.m34829y()) {
                String m34813i = characterReader.m34813i();
                tokeniser.f69185k.m34911n(m34813i);
                tokeniser.f69182h.append(m34813i);
                return;
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                if (tokeniser.m34943l()) {
                    tokeniser.m34944m(TokeniserState.BeforeAttributeName);
                    return;
                } else {
                    m34951h(tokeniser, characterReader);
                    return;
                }
            }
            if (m34810f == '/') {
                if (tokeniser.m34943l()) {
                    tokeniser.m34944m(TokeniserState.SelfClosingStartTag);
                    return;
                } else {
                    m34951h(tokeniser, characterReader);
                    return;
                }
            }
            if (m34810f != '>') {
                m34951h(tokeniser, characterReader);
            } else if (!tokeniser.m34943l()) {
                m34951h(tokeniser, characterReader);
            } else {
                tokeniser.m34940i();
                tokeniser.m34944m(TokeniserState.Data);
            }
        }

        /* renamed from: h */
        public final void m34951h(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.m34937f("</");
            tokeniser.m34938g(tokeniser.f69182h);
            characterReader.m34805E();
            tokeniser.m34944m(TokeniserState.Rcdata);
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.m34827w(JsonPointer.SEPARATOR)) {
                tokeniser.m34936e('<');
                tokeniser.m34944m(TokeniserState.Rawtext);
            } else {
                Token.m34893h(tokeniser.f69182h);
                tokeniser.m34944m(TokeniserState.RawtextEndTagOpen);
                tokeniser.f69175a.m34806a();
            }
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34947c(tokeniser, characterReader, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34948d(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char m34810f = characterReader.m34810f();
            if (m34810f == '!') {
                tokeniser.m34937f("<!");
                tokeniser.m34944m(TokeniserState.ScriptDataEscapeStart);
                return;
            }
            if (m34810f == '/') {
                Token.m34893h(tokeniser.f69182h);
                tokeniser.m34944m(TokeniserState.ScriptDataEndTagOpen);
            } else if (m34810f != 65535) {
                tokeniser.m34937f("<");
                characterReader.m34805E();
                tokeniser.m34944m(TokeniserState.ScriptData);
            } else {
                tokeniser.m34937f("<");
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34947c(tokeniser, characterReader, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34948d(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.m34827w('-')) {
                tokeniser.m34944m(TokeniserState.ScriptData);
                return;
            }
            tokeniser.m34936e('-');
            tokeniser.m34944m(TokeniserState.ScriptDataEscapeStartDash);
            tokeniser.f69175a.m34806a();
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.m34827w('-')) {
                tokeniser.m34944m(TokeniserState.ScriptData);
                return;
            }
            tokeniser.m34936e('-');
            tokeniser.m34944m(TokeniserState.ScriptDataEscapedDashDash);
            tokeniser.f69175a.m34806a();
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.m34820p()) {
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
                return;
            }
            char m34818n = characterReader.m34818n();
            if (m34818n == 0) {
                tokeniser.m34942k(this);
                characterReader.m34806a();
                tokeniser.m34936e((char) 65533);
            } else if (m34818n == '-') {
                tokeniser.m34936e('-');
                tokeniser.m34944m(TokeniserState.ScriptDataEscapedDash);
                tokeniser.f69175a.m34806a();
            } else if (m34818n != '<') {
                tokeniser.m34937f(characterReader.m34815k('-', '<', 0));
            } else {
                tokeniser.m34944m(TokeniserState.ScriptDataEscapedLessthanSign);
                tokeniser.f69175a.m34806a();
            }
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.ScriptDataEscaped;
            if (characterReader.m34820p()) {
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
                return;
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.m34936e((char) 65533);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f == '-') {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(TokeniserState.ScriptDataEscapedDashDash);
            } else if (m34810f == '<') {
                tokeniser.m34944m(TokeniserState.ScriptDataEscapedLessthanSign);
            } else {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.ScriptDataEscaped;
            if (characterReader.m34820p()) {
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
                return;
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.m34936e((char) 65533);
                tokeniser.m34944m(tokeniserState);
            } else {
                if (m34810f == '-') {
                    tokeniser.m34936e(m34810f);
                    return;
                }
                if (m34810f == '<') {
                    tokeniser.m34944m(TokeniserState.ScriptDataEscapedLessthanSign);
                } else if (m34810f != '>') {
                    tokeniser.m34936e(m34810f);
                    tokeniser.m34944m(tokeniserState);
                } else {
                    tokeniser.m34936e(m34810f);
                    tokeniser.m34944m(TokeniserState.ScriptData);
                }
            }
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.m34829y()) {
                Token.m34893h(tokeniser.f69182h);
                tokeniser.f69182h.append(characterReader.m34818n());
                tokeniser.m34937f("<");
                tokeniser.m34936e(characterReader.m34818n());
                tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscapeStart);
                tokeniser.f69175a.m34806a();
                return;
            }
            if (!characterReader.m34827w(JsonPointer.SEPARATOR)) {
                tokeniser.m34936e('<');
                tokeniser.m34944m(TokeniserState.ScriptDataEscaped);
            } else {
                Token.m34893h(tokeniser.f69182h);
                tokeniser.m34944m(TokeniserState.ScriptDataEscapedEndTagOpen);
                tokeniser.f69175a.m34806a();
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.m34829y()) {
                tokeniser.m34937f("</");
                tokeniser.m34944m(TokeniserState.ScriptDataEscaped);
                return;
            }
            tokeniser.m34935d(false);
            tokeniser.f69185k.m34910m(characterReader.m34818n());
            tokeniser.f69182h.append(characterReader.m34818n());
            tokeniser.m34944m(TokeniserState.ScriptDataEscapedEndTagName);
            tokeniser.f69175a.m34806a();
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34948d(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34949e(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char m34818n = characterReader.m34818n();
            if (m34818n == 0) {
                tokeniser.m34942k(this);
                characterReader.m34806a();
                tokeniser.m34936e((char) 65533);
                return;
            }
            if (m34818n == '-') {
                tokeniser.m34936e(m34818n);
                tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscapedDash);
                tokeniser.f69175a.m34806a();
            } else if (m34818n == '<') {
                tokeniser.m34936e(m34818n);
                tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                tokeniser.f69175a.m34806a();
            } else if (m34818n != 65535) {
                tokeniser.m34937f(characterReader.m34815k('-', '<', 0));
            } else {
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.ScriptDataDoubleEscaped;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.m34936e((char) 65533);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f == '-') {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscapedDashDash);
            } else if (m34810f == '<') {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (m34810f != 65535) {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(tokeniserState);
            } else {
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.ScriptDataDoubleEscaped;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.m34936e((char) 65533);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f == '-') {
                tokeniser.m34936e(m34810f);
                return;
            }
            if (m34810f == '<') {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
            } else if (m34810f == '>') {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(TokeniserState.ScriptData);
            } else if (m34810f != 65535) {
                tokeniser.m34936e(m34810f);
                tokeniser.m34944m(tokeniserState);
            } else {
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (!characterReader.m34827w(JsonPointer.SEPARATOR)) {
                tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscaped);
                return;
            }
            tokeniser.m34936e(JsonPointer.SEPARATOR);
            Token.m34893h(tokeniser.f69182h);
            tokeniser.m34944m(TokeniserState.ScriptDataDoubleEscapeEnd);
            tokeniser.f69175a.m34806a();
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.m34949e(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.AttributeName;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                characterReader.m34805E();
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34917t();
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f != ' ') {
                if (m34810f != '\"' && m34810f != '\'') {
                    if (m34810f == '/') {
                        tokeniser.m34944m(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (m34810f == 65535) {
                        tokeniser.m34941j(this);
                        tokeniser.m34944m(tokeniserState);
                        return;
                    }
                    if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r') {
                        return;
                    }
                    switch (m34810f) {
                        case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            characterReader.m34805E();
                            tokeniser.m34942k(this);
                            break;
                        case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            break;
                        case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            break;
                        default:
                            tokeniser.f69185k.m34917t();
                            characterReader.m34805E();
                            tokeniser.m34944m(tokeniserState2);
                            return;
                    }
                    tokeniser.m34940i();
                    tokeniser.m34944m(tokeniserState);
                    return;
                }
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34917t();
                tokeniser.f69185k.m34906i(m34810f);
                tokeniser.m34944m(tokeniserState2);
            }
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            String m34816l = characterReader.m34816l(TokeniserState.f69254q0);
            Token.Tag tag = tokeniser.f69185k;
            Objects.requireNonNull(tag);
            String replace = m34816l.replace((char) 0, (char) 65533);
            tag.f69157h = true;
            String str = tag.f69156g;
            if (str != null) {
                tag.f69155f.append(str);
                tag.f69156g = null;
            }
            if (tag.f69155f.length() == 0) {
                tag.f69156g = replace;
            } else {
                tag.f69155f.append(replace);
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                tokeniser.m34944m(TokeniserState.AfterAttributeName);
                return;
            }
            if (m34810f != '\"' && m34810f != '\'') {
                if (m34810f == '/') {
                    tokeniser.m34944m(TokeniserState.SelfClosingStartTag);
                    return;
                }
                if (m34810f == 65535) {
                    tokeniser.m34941j(this);
                    tokeniser.m34944m(tokeniserState);
                    return;
                }
                switch (m34810f) {
                    case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        break;
                    case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        tokeniser.m34944m(TokeniserState.BeforeAttributeValue);
                        break;
                    case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        tokeniser.m34940i();
                        tokeniser.m34944m(tokeniserState);
                        break;
                    default:
                        tokeniser.f69185k.m34906i(m34810f);
                        break;
                }
                return;
            }
            tokeniser.m34942k(this);
            tokeniser.f69185k.m34906i(m34810f);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.AttributeName;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34906i((char) 65533);
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f != ' ') {
                if (m34810f != '\"' && m34810f != '\'') {
                    if (m34810f == '/') {
                        tokeniser.m34944m(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                    if (m34810f == 65535) {
                        tokeniser.m34941j(this);
                        tokeniser.m34944m(tokeniserState);
                        return;
                    }
                    if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r') {
                        return;
                    }
                    switch (m34810f) {
                        case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            break;
                        case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            tokeniser.m34944m(TokeniserState.BeforeAttributeValue);
                            break;
                        case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            tokeniser.m34940i();
                            tokeniser.m34944m(tokeniserState);
                            break;
                        default:
                            tokeniser.f69185k.m34917t();
                            characterReader.m34805E();
                            tokeniser.m34944m(tokeniserState2);
                            break;
                    }
                    return;
                }
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34917t();
                tokeniser.f69185k.m34906i(m34810f);
                tokeniser.m34944m(tokeniserState2);
            }
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.AttributeValue_unquoted;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34907j((char) 65533);
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f != ' ') {
                if (m34810f == '\"') {
                    tokeniser.m34944m(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                if (m34810f != '`') {
                    if (m34810f == 65535) {
                        tokeniser.m34941j(this);
                        tokeniser.m34940i();
                        tokeniser.m34944m(tokeniserState);
                        return;
                    }
                    if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r') {
                        return;
                    }
                    if (m34810f == '&') {
                        characterReader.m34805E();
                        tokeniser.m34944m(tokeniserState2);
                        return;
                    }
                    if (m34810f == '\'') {
                        tokeniser.m34944m(TokeniserState.AttributeValue_singleQuoted);
                        return;
                    }
                    switch (m34810f) {
                        case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            break;
                        case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            tokeniser.m34942k(this);
                            tokeniser.m34940i();
                            tokeniser.m34944m(tokeniserState);
                            break;
                        default:
                            characterReader.m34805E();
                            tokeniser.m34944m(tokeniserState2);
                            break;
                    }
                    return;
                }
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34907j(m34810f);
                tokeniser.m34944m(tokeniserState2);
            }
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            String m34811g = characterReader.m34811g(false);
            if (m34811g.length() > 0) {
                tokeniser.f69185k.m34908k(m34811g);
            } else {
                tokeniser.f69185k.f69161l = true;
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34907j((char) 65533);
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34944m(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            if (m34810f != '&') {
                if (m34810f != 65535) {
                    tokeniser.f69185k.m34907j(m34810f);
                    return;
                } else {
                    tokeniser.m34941j(this);
                    tokeniser.m34944m(TokeniserState.Data);
                    return;
                }
            }
            int[] m34933b = tokeniser.m34933b(Character.valueOf(JsonFactory.DEFAULT_QUOTE_CHAR), true);
            if (m34933b != null) {
                tokeniser.f69185k.m34909l(m34933b);
            } else {
                tokeniser.f69185k.m34907j('&');
            }
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            String m34811g = characterReader.m34811g(true);
            if (m34811g.length() > 0) {
                tokeniser.f69185k.m34908k(m34811g);
            } else {
                tokeniser.f69185k.f69161l = true;
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34907j((char) 65533);
                return;
            }
            if (m34810f == 65535) {
                tokeniser.m34941j(this);
                tokeniser.m34944m(TokeniserState.Data);
                return;
            }
            if (m34810f != '&') {
                if (m34810f != '\'') {
                    tokeniser.f69185k.m34907j(m34810f);
                    return;
                } else {
                    tokeniser.m34944m(TokeniserState.AfterAttributeValue_quoted);
                    return;
                }
            }
            int[] m34933b = tokeniser.m34933b('\'', true);
            if (m34933b != null) {
                tokeniser.f69185k.m34909l(m34933b);
            } else {
                tokeniser.f69185k.m34907j('&');
            }
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            String m34816l = characterReader.m34816l(TokeniserState.f69256r0);
            if (m34816l.length() > 0) {
                tokeniser.f69185k.m34908k(m34816l);
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34907j((char) 65533);
                return;
            }
            if (m34810f != ' ') {
                if (m34810f != '\"' && m34810f != '`') {
                    if (m34810f == 65535) {
                        tokeniser.m34941j(this);
                        tokeniser.m34944m(tokeniserState);
                        return;
                    }
                    if (m34810f != '\t' && m34810f != '\n' && m34810f != '\f' && m34810f != '\r') {
                        if (m34810f == '&') {
                            int[] m34933b = tokeniser.m34933b('>', true);
                            if (m34933b != null) {
                                tokeniser.f69185k.m34909l(m34933b);
                                return;
                            } else {
                                tokeniser.f69185k.m34907j('&');
                                return;
                            }
                        }
                        if (m34810f != '\'') {
                            switch (m34810f) {
                                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                    break;
                                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                    tokeniser.m34940i();
                                    tokeniser.m34944m(tokeniserState);
                                    break;
                                default:
                                    tokeniser.f69185k.m34907j(m34810f);
                                    break;
                            }
                            return;
                        }
                    }
                }
                tokeniser.m34942k(this);
                tokeniser.f69185k.m34907j(m34810f);
                return;
            }
            tokeniser.m34944m(TokeniserState.BeforeAttributeName);
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.BeforeAttributeName;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f == '/') {
                tokeniser.m34944m(TokeniserState.SelfClosingStartTag);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34940i();
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f == 65535) {
                tokeniser.m34941j(this);
                tokeniser.m34944m(tokeniserState);
            } else {
                characterReader.m34805E();
                tokeniser.m34942k(this);
                tokeniser.m34944m(tokeniserState2);
            }
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '>') {
                tokeniser.f69185k.f69162m = true;
                tokeniser.m34940i();
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f == 65535) {
                tokeniser.m34941j(this);
                tokeniser.m34944m(tokeniserState);
            } else {
                characterReader.m34805E();
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.BeforeAttributeName);
            }
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.f69188n.m34902j(characterReader.m34814j('>'));
            char m34818n = characterReader.m34818n();
            if (m34818n == '>' || m34818n == 65535) {
                characterReader.m34810f();
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.m34825u("--")) {
                tokeniser.f69188n.mo34900g();
                tokeniser.m34944m(TokeniserState.CommentStart);
            } else {
                if (characterReader.m34826v("DOCTYPE")) {
                    tokeniser.m34944m(TokeniserState.Doctype);
                    return;
                }
                if (characterReader.m34825u("[CDATA[")) {
                    Token.m34893h(tokeniser.f69182h);
                    tokeniser.m34944m(TokeniserState.CdataSection);
                } else {
                    tokeniser.m34942k(this);
                    tokeniser.m34934c();
                    tokeniser.m34944m(TokeniserState.BogusComment);
                }
            }
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.Comment;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69188n.m34901i((char) 65533);
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f == '-') {
                tokeniser.m34944m(TokeniserState.CommentStartDash);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f != 65535) {
                characterReader.m34805E();
                tokeniser.m34944m(tokeniserState2);
            } else {
                tokeniser.m34941j(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.Comment;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69188n.m34901i((char) 65533);
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f == '-') {
                tokeniser.m34944m(TokeniserState.CommentEnd);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f != 65535) {
                tokeniser.f69188n.m34901i(m34810f);
                tokeniser.m34944m(tokeniserState2);
            } else {
                tokeniser.m34941j(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            char m34818n = characterReader.m34818n();
            if (m34818n == 0) {
                tokeniser.m34942k(this);
                characterReader.m34806a();
                tokeniser.f69188n.m34901i((char) 65533);
            } else if (m34818n == '-') {
                tokeniser.m34944m(TokeniserState.CommentEndDash);
                tokeniser.f69175a.m34806a();
            } else {
                if (m34818n != 65535) {
                    tokeniser.f69188n.m34902j(characterReader.m34815k('-', 0));
                    return;
                }
                tokeniser.m34941j(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Comment;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                Token.Comment comment = tokeniser.f69188n;
                comment.m34901i('-');
                comment.m34901i((char) 65533);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f == '-') {
                tokeniser.m34944m(TokeniserState.CommentEnd);
                return;
            }
            if (m34810f == 65535) {
                tokeniser.m34941j(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(TokeniserState.Data);
            } else {
                Token.Comment comment2 = tokeniser.f69188n;
                comment2.m34901i('-');
                comment2.m34901i(m34810f);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.Comment;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                Token.Comment comment = tokeniser.f69188n;
                comment.m34902j("--");
                comment.m34901i((char) 65533);
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f == '!') {
                tokeniser.m34944m(TokeniserState.CommentEndBang);
                return;
            }
            if (m34810f == '-') {
                tokeniser.f69188n.m34901i('-');
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f == 65535) {
                tokeniser.m34941j(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            } else {
                Token.Comment comment2 = tokeniser.f69188n;
                comment2.m34902j("--");
                comment2.m34901i(m34810f);
                tokeniser.m34944m(tokeniserState2);
            }
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            TokeniserState tokeniserState2 = TokeniserState.Comment;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                Token.Comment comment = tokeniser.f69188n;
                comment.m34902j("--!");
                comment.m34901i((char) 65533);
                tokeniser.m34944m(tokeniserState2);
                return;
            }
            if (m34810f == '-') {
                tokeniser.f69188n.m34902j("--!");
                tokeniser.m34944m(TokeniserState.CommentEndDash);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f == 65535) {
                tokeniser.m34941j(this);
                tokeniser.m34939h(tokeniser.f69188n);
                tokeniser.m34944m(tokeniserState);
            } else {
                Token.Comment comment2 = tokeniser.f69188n;
                comment2.m34902j("--!");
                comment2.m34901i(m34810f);
                tokeniser.m34944m(tokeniserState2);
            }
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.BeforeDoctypeName;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != '>') {
                if (m34810f != 65535) {
                    tokeniser.m34942k(this);
                    tokeniser.m34944m(tokeniserState);
                    return;
                }
                tokeniser.m34941j(this);
            }
            tokeniser.m34942k(this);
            tokeniser.f69187m.mo34900g();
            Token.Doctype doctype = tokeniser.f69187m;
            doctype.f69152h = true;
            tokeniser.m34939h(doctype);
            tokeniser.m34944m(TokeniserState.Data);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.DoctypeName;
            if (characterReader.m34829y()) {
                tokeniser.f69187m.mo34900g();
                tokeniser.m34944m(tokeniserState);
                return;
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.mo34900g();
                tokeniser.f69187m.f69148d.append((char) 65533);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != ' ') {
                if (m34810f == 65535) {
                    tokeniser.m34941j(this);
                    tokeniser.f69187m.mo34900g();
                    Token.Doctype doctype = tokeniser.f69187m;
                    doctype.f69152h = true;
                    tokeniser.m34939h(doctype);
                    tokeniser.m34944m(TokeniserState.Data);
                    return;
                }
                if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r') {
                    return;
                }
                tokeniser.f69187m.mo34900g();
                tokeniser.f69187m.f69148d.append(m34810f);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            if (characterReader.m34830z()) {
                tokeniser.f69187m.f69148d.append(characterReader.m34813i());
                return;
            }
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69148d.append((char) 65533);
                return;
            }
            if (m34810f != ' ') {
                if (m34810f == '>') {
                    tokeniser.m34939h(tokeniser.f69187m);
                    tokeniser.m34944m(tokeniserState);
                    return;
                }
                if (m34810f == 65535) {
                    tokeniser.m34941j(this);
                    Token.Doctype doctype = tokeniser.f69187m;
                    doctype.f69152h = true;
                    tokeniser.m34939h(doctype);
                    tokeniser.m34944m(tokeniserState);
                    return;
                }
                if (m34810f != '\t' && m34810f != '\n' && m34810f != '\f' && m34810f != '\r') {
                    tokeniser.f69187m.f69148d.append(m34810f);
                    return;
                }
            }
            tokeniser.m34944m(TokeniserState.AfterDoctypeName);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            if (characterReader.m34820p()) {
                tokeniser.m34941j(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (characterReader.m34828x('\t', '\n', '\r', '\f', ' ')) {
                characterReader.m34806a();
                return;
            }
            if (characterReader.m34827w('>')) {
                tokeniser.m34939h(tokeniser.f69187m);
                tokeniser.m34944m(tokeniserState);
                tokeniser.f69175a.m34806a();
            } else if (characterReader.m34826v("PUBLIC")) {
                tokeniser.f69187m.f69149e = "PUBLIC";
                tokeniser.m34944m(TokeniserState.AfterDoctypePublicKeyword);
            } else if (characterReader.m34826v("SYSTEM")) {
                tokeniser.f69187m.f69149e = "SYSTEM";
                tokeniser.m34944m(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69152h = true;
                tokeniser.m34944m(TokeniserState.BogusDoctype);
                tokeniser.f69175a.m34806a();
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                tokeniser.m34944m(TokeniserState.BeforeDoctypePublicIdentifier);
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69152h = true;
                tokeniser.m34944m(TokeniserState.BogusDoctype);
            } else {
                tokeniser.m34941j(this);
                Token.Doctype doctype2 = tokeniser.f69187m;
                doctype2.f69152h = true;
                tokeniser.m34939h(doctype2);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34944m(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34944m(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69152h = true;
                tokeniser.m34944m(TokeniserState.BogusDoctype);
            } else {
                tokeniser.m34941j(this);
                Token.Doctype doctype2 = tokeniser.f69187m;
                doctype2.f69152h = true;
                tokeniser.m34939h(doctype2);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69150f.append((char) 65533);
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34944m(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.f69187m.f69150f.append(m34810f);
                return;
            }
            tokeniser.m34941j(this);
            Token.Doctype doctype2 = tokeniser.f69187m;
            doctype2.f69152h = true;
            tokeniser.m34939h(doctype2);
            tokeniser.m34944m(tokeniserState);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69150f.append((char) 65533);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34944m(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.f69187m.f69150f.append(m34810f);
                return;
            }
            tokeniser.m34941j(this);
            Token.Doctype doctype2 = tokeniser.f69187m;
            doctype2.f69152h = true;
            tokeniser.m34939h(doctype2);
            tokeniser.m34944m(tokeniserState);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                tokeniser.m34944m(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34939h(tokeniser.f69187m);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f != 65535) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69152h = true;
                tokeniser.m34944m(TokeniserState.BogusDoctype);
            } else {
                tokeniser.m34941j(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34939h(tokeniser.f69187m);
                tokeniser.m34944m(tokeniserState);
            } else if (m34810f != 65535) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69152h = true;
                tokeniser.m34944m(TokeniserState.BogusDoctype);
            } else {
                tokeniser.m34941j(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                tokeniser.m34944m(TokeniserState.BeforeDoctypeSystemIdentifier);
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34942k(this);
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.m34942k(this);
                Token.Doctype doctype2 = tokeniser.f69187m;
                doctype2.f69152h = true;
                tokeniser.m34939h(doctype2);
                return;
            }
            tokeniser.m34941j(this);
            Token.Doctype doctype3 = tokeniser.f69187m;
            doctype3.f69152h = true;
            tokeniser.m34939h(doctype3);
            tokeniser.m34944m(tokeniserState);
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34944m(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69152h = true;
                tokeniser.m34944m(TokeniserState.BogusDoctype);
            } else {
                tokeniser.m34941j(this);
                Token.Doctype doctype2 = tokeniser.f69187m;
                doctype2.f69152h = true;
                tokeniser.m34939h(doctype2);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69151g.append((char) 65533);
                return;
            }
            if (m34810f == '\"') {
                tokeniser.m34944m(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.f69187m.f69151g.append(m34810f);
                return;
            }
            tokeniser.m34941j(this);
            Token.Doctype doctype2 = tokeniser.f69187m;
            doctype2.f69152h = true;
            tokeniser.m34939h(doctype2);
            tokeniser.m34944m(tokeniserState);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == 0) {
                tokeniser.m34942k(this);
                tokeniser.f69187m.f69151g.append((char) 65533);
                return;
            }
            if (m34810f == '\'') {
                tokeniser.m34944m(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34942k(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
                return;
            }
            if (m34810f != 65535) {
                tokeniser.f69187m.f69151g.append(m34810f);
                return;
            }
            tokeniser.m34941j(this);
            Token.Doctype doctype2 = tokeniser.f69187m;
            doctype2.f69152h = true;
            tokeniser.m34939h(doctype2);
            tokeniser.m34944m(tokeniserState);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                return;
            }
            if (m34810f == '>') {
                tokeniser.m34939h(tokeniser.f69187m);
                tokeniser.m34944m(tokeniserState);
            } else {
                if (m34810f != 65535) {
                    tokeniser.m34942k(this);
                    tokeniser.m34944m(TokeniserState.BogusDoctype);
                    return;
                }
                tokeniser.m34941j(this);
                Token.Doctype doctype = tokeniser.f69187m;
                doctype.f69152h = true;
                tokeniser.m34939h(doctype);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState tokeniserState = TokeniserState.Data;
            char m34810f = characterReader.m34810f();
            if (m34810f == '>') {
                tokeniser.m34939h(tokeniser.f69187m);
                tokeniser.m34944m(tokeniserState);
            } else {
                if (m34810f != 65535) {
                    return;
                }
                tokeniser.m34939h(tokeniser.f69187m);
                tokeniser.m34944m(tokeniserState);
            }
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        /* renamed from: f */
        public void mo34950f(Tokeniser tokeniser, CharacterReader characterReader) {
            String m34800c;
            int m34801A = characterReader.m34801A("]]>");
            if (m34801A != -1) {
                m34800c = CharacterReader.m34800c(characterReader.f69017a, characterReader.f69024h, characterReader.f69021e, m34801A);
                characterReader.f69021e += m34801A;
            } else {
                int i2 = characterReader.f69019c;
                int i3 = characterReader.f69021e;
                if (i2 - i3 < 3) {
                    m34800c = characterReader.m34817m();
                } else {
                    int i4 = (i2 - 3) + 1;
                    m34800c = CharacterReader.m34800c(characterReader.f69017a, characterReader.f69024h, i3, i4 - i3);
                    characterReader.f69021e = i4;
                }
            }
            tokeniser.f69182h.append(m34800c);
            if (characterReader.m34825u("]]>") || characterReader.m34820p()) {
                tokeniser.m34939h(new Token.CData(tokeniser.f69182h.toString()));
                tokeniser.m34944m(TokeniserState.Data);
            }
        }
    };


    /* renamed from: q0 */
    public static final char[] f69254q0 = {'\t', '\n', '\f', '\r', ' ', JsonFactory.DEFAULT_QUOTE_CHAR, '\'', JsonPointer.SEPARATOR, '<', '=', '>'};

    /* renamed from: r0 */
    public static final char[] f69256r0 = {0, '\t', '\n', '\f', '\r', ' ', JsonFactory.DEFAULT_QUOTE_CHAR, '&', '\'', '<', '=', '>', '`'};

    /* renamed from: s0 */
    public static final String f69258s0 = String.valueOf((char) 65533);

    TokeniserState(C69051 c69051) {
    }

    /* renamed from: a */
    public static void m34945a(Tokeniser tokeniser, TokeniserState tokeniserState) {
        int[] m34933b = tokeniser.m34933b(null, false);
        if (m34933b == null) {
            tokeniser.m34936e('&');
        } else {
            tokeniser.m34937f(new String(m34933b, 0, m34933b.length));
        }
        tokeniser.m34944m(tokeniserState);
    }

    /* renamed from: b */
    public static void m34946b(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char m34818n = characterReader.m34818n();
        if (m34818n == 0) {
            tokeniser.m34942k(tokeniserState);
            characterReader.m34806a();
            tokeniser.m34936e((char) 65533);
            return;
        }
        if (m34818n == '<') {
            tokeniser.m34944m(tokeniserState2);
            tokeniser.f69175a.m34806a();
            return;
        }
        if (m34818n == 65535) {
            tokeniser.m34939h(new Token.EOF());
            return;
        }
        int i2 = characterReader.f69021e;
        int i3 = characterReader.f69019c;
        char[] cArr = characterReader.f69017a;
        int i4 = i2;
        while (i4 < i3) {
            char c2 = cArr[i4];
            if (c2 == 0 || c2 == '<') {
                break;
            } else {
                i4++;
            }
        }
        characterReader.f69021e = i4;
        tokeniser.m34937f(i4 > i2 ? CharacterReader.m34800c(characterReader.f69017a, characterReader.f69024h, i2, i4 - i2) : "");
    }

    /* renamed from: c */
    public static void m34947c(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.m34829y()) {
            tokeniser.m34935d(false);
            tokeniser.m34944m(tokeniserState);
        } else {
            tokeniser.m34937f("</");
            tokeniser.m34944m(tokeniserState2);
        }
    }

    /* renamed from: d */
    public static void m34948d(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        if (characterReader.m34830z()) {
            String m34813i = characterReader.m34813i();
            tokeniser.f69185k.m34911n(m34813i);
            tokeniser.f69182h.append(m34813i);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (tokeniser.m34943l() && !characterReader.m34820p()) {
            char m34810f = characterReader.m34810f();
            if (m34810f == '\t' || m34810f == '\n' || m34810f == '\f' || m34810f == '\r' || m34810f == ' ') {
                tokeniser.m34944m(BeforeAttributeName);
            } else if (m34810f == '/') {
                tokeniser.m34944m(SelfClosingStartTag);
            } else if (m34810f != '>') {
                tokeniser.f69182h.append(m34810f);
                z = true;
            } else {
                tokeniser.m34940i();
                tokeniser.m34944m(Data);
            }
            z2 = z;
        }
        if (z2) {
            tokeniser.m34937f("</");
            tokeniser.m34938g(tokeniser.f69182h);
            tokeniser.m34944m(tokeniserState);
        }
    }

    /* renamed from: e */
    public static void m34949e(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.m34830z()) {
            String m34813i = characterReader.m34813i();
            tokeniser.f69182h.append(m34813i);
            tokeniser.m34937f(m34813i);
            return;
        }
        char m34810f = characterReader.m34810f();
        if (m34810f != '\t' && m34810f != '\n' && m34810f != '\f' && m34810f != '\r' && m34810f != ' ' && m34810f != '/' && m34810f != '>') {
            characterReader.m34805E();
            tokeniser.m34944m(tokeniserState2);
        } else {
            if (tokeniser.f69182h.toString().equals("script")) {
                tokeniser.m34944m(tokeniserState);
            } else {
                tokeniser.m34944m(tokeniserState2);
            }
            tokeniser.m34936e(m34810f);
        }
    }

    /* renamed from: f */
    public abstract void mo34950f(Tokeniser tokeniser, CharacterReader characterReader);
}
