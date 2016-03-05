/*******************************************************************************
 * KOMORAN 3.0 - Korean Morphology Analyzer
 *
 * Copyright 2015 Shineware http://www.shineware.co.kr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 	
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package kr.co.shineware.nlp.komoran.test;

import java.util.List;

import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.util.common.model.Pair;

public class KomoranTest {

	public static void main(String[] args) throws Exception {
		Komoran komoran = new Komoran("models");
		komoran.setFWDic("user_data/fwd.user");
		komoran.setUserDic("user_data/dic.user");
		List<Pair<String,String>> analyzeReulstList = komoran.analyze("먹기은 쿠팡 로켓배송 엄청 빠릅니다.");
//		List<Pair<String,String>> analyzeReulstList = komoran.analyze("한국어버그는 언제쯤 고쳐지나요?");
		
		for (Pair<String, String> token : analyzeReulstList) {
			System.out.println(token);
		}
	}
}
