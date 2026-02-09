import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		// HashSet으로 중복 제거
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		// 정렬을 위해 list로 변환
		List<String> list = new ArrayList<>(set);

		// 길이가 짧은 것부터, 길이가 같으면 사전 순으로
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length()) {
					return s1.length() - s2.length();
				}
				return s1.compareTo(s2);
			}
		});

		// StringBuider로 결과를 모아서 출력
		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}