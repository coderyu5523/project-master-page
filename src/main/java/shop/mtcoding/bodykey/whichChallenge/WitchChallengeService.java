package shop.mtcoding.bodykey.whichChallenge;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WitchChallengeService {
    private final WitchChallengeJPARepository witchChallengeJPARepository ;
}