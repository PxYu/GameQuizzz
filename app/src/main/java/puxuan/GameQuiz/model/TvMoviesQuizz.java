package puxuan.GameQuiz.model;

import android.content.Context;
import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import puxuan.GameQuiz.QuizzHelper;
import puxuan.GameQuiz.R;
import puxuan.GameQuiz.fragment.CheckBoxValueSelectionFragment;
import puxuan.GameQuiz.fragment.GroupLayoutSelectionFragment;
import puxuan.GameQuiz.fragment.RadioGroupSelectionFragment;
import puxuan.GameQuiz.fragment.SeekBarValueSelectionFragment;
import puxuan.GameQuiz.fragment.TextValueSelectionFragment;
import puxuan.GameQuiz.fragment.TrueFalseSelectionFragment;

/**
 * Created by etien on 12/02/2016.
 */
public class TvMoviesQuizz implements QuizzContent {

    private final List<QuizzQuestion> mQuizzQuestions;

    public TvMoviesQuizz(Context context) {
        mQuizzQuestions = new ArrayList<>();
        List<String> mAnswer, mPossibleAnswer;
        String question;

        String[] questions = context.getResources().getStringArray(R.array.tv_movies_question);

        /* QUESTION 1 */
        question = questions[0];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_0);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_0);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new CheckBoxValueSelectionFragment();
            }
        });

        /* QUESTION 2 */
        question = questions[1];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_1);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_1);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new TextValueSelectionFragment();
            }
        });

        /* QUESTION 3 */
        question = questions[2];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_2);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_2);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new GroupLayoutSelectionFragment();
            }
        });

        /* QUESTION 4 */
        question = questions[3];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_3);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_3);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new RadioGroupSelectionFragment();
            }
        });

        /* QUESTION 5 */
        question = questions[4];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_4);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_4);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new SeekBarValueSelectionFragment();
            }
        });

        /* QUESTION 6 */
        question = questions[5];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_5);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_5);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new TextValueSelectionFragment();
            }
        });

        /* QUESTION 7 */
        question = questions[6];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_6);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_6);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new TrueFalseSelectionFragment();
            }
        });

        /* QUESTION 8 */
        question = questions[7];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_7);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_7);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new SeekBarValueSelectionFragment();
            }
        });

        /* QUESTION 9 */
        question = questions[8];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_8);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_8);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new GroupLayoutSelectionFragment();
            }
        });

        /* QUESTION 10 */
        question = questions[9];
        mAnswer = QuizzHelper.getAnswersFromResources(context, R.string.tv_movies_answer_9);
        mPossibleAnswer  = QuizzHelper.getPossibleAnswersFromResources(context, R.string.tv_movies_answer_9);
        mQuizzQuestions.add(new QuizzQuestion(question, mPossibleAnswer, mAnswer) {
            @Override
            public Fragment getQuizzFragment() {
                return new TextValueSelectionFragment();
            }
        });
    }

    @Override
    public List<QuizzQuestion> getQuizzQuestions() {
        return mQuizzQuestions;
    }

    @Override
    public String getQuizzName(Context context) {
        return context.getString(R.string.tv_movies);
    }
}
