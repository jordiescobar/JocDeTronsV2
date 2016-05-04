package net.infobosccoma.JocDeTrons;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.Manifold;

import net.infobosccoma.JocDeTrons.Screens.Level1;
import net.infobosccoma.JocDeTrons.Screens.Level2;

import java.util.ArrayList;
/**
 * Classe que implementa la interface de gestió de contactes
 * 
 * @author Marc
 *
 */
public class GestorContactes implements ContactListener {
	//<editor-fold desc="Atributs">
	// de moment, no utilitzat
	private ArrayList<Body> bodyDestroyList;
	//</editor-fold>
    private JocDeTrons joc;

	//<editor-fold desc="Constructors">
	public GestorContactes(JocDeTrons joc) {

		this.joc = joc;

	}
	
	public GestorContactes(ArrayList<Body> bodyDestroyList) {
		this.bodyDestroyList = bodyDestroyList;
	}
	@Override
	public void beginContact(Contact contact) {
		Fixture fixtureA = contact.getFixtureA();
		Fixture fixtureB = contact.getFixtureB();

		if (fixtureA.getBody().getUserData() == null || fixtureB.getBody().getUserData() == null) {

			return;

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("foc1") || fixtureA.getBody().getUserData().equals("foc1") && fixtureB.getBody().getUserData().equals("Personatge")) {

				Gdx.app.postRunnable(new Runnable() {
					@Override
					public void run() {

						joc.setScreen(new Level1(joc, 9.0f, 4.0f));
					}
				});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("foc2") || fixtureA.getBody().getUserData().equals("foc2") && fixtureB.getBody().getUserData().equals("Personatge")) {

			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

					joc.setScreen(new Level1(joc, 9.0f, 4.0f));
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("foc3") || fixtureA.getBody().getUserData().equals("foc3") && fixtureB.getBody().getUserData().equals("Personatge")) {

			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

					joc.setScreen(new Level1(joc, 9.0f, 4.0f));
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("punxes1") || fixtureA.getBody().getUserData().equals("punxes1") && fixtureB.getBody().getUserData().equals("Personatge")) {

			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

					joc.setScreen(new Level1(joc, 9.0f, 4.0f));
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("punxes2") || fixtureA.getBody().getUserData().equals("punxes2") && fixtureB.getBody().getUserData().equals("Personatge")) {

			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

					joc.setScreen(new Level1(joc, 42.0f, 4.0f));
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("punxes3") || fixtureA.getBody().getUserData().equals("punxes3") && fixtureB.getBody().getUserData().equals("Personatge")) {

			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

					joc.setScreen(new Level1(joc, 42.0f, 4.0f));
				}
			});

		}

		if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("aigua") || fixtureA.getBody().getUserData().equals("aigua") && fixtureB.getBody().getUserData().equals("Personatge")) {

			Gdx.app.postRunnable(new Runnable() {
				@Override
				public void run() {

					joc.setScreen(new Level1(joc, 74.0f, 4.0f));
				}
			});

		}

        if (fixtureA.getBody().getUserData().equals("Personatge") && fixtureB.getBody().getUserData().equals("tronoHierro") || fixtureA.getBody().getUserData().equals("tronoHierro") && fixtureB.getBody().getUserData().equals("Personatge")) {

            Gdx.app.postRunnable(new Runnable() {
                @Override
                public void run() {

                    joc.setScreen(new Level2(joc));
                }
            });

        }
	}
	//</editor-fold>

	//<editor-fold desc="Mètodes implementats de la interface ContactListener">
	@Override
	public void endContact(Contact contact) {

	}

	@Override
	public void preSolve(Contact contact, Manifold oldManifold) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postSolve(Contact contact, ContactImpulse impulse) {
		// TODO Auto-generated method stub

	}
	//</editor-fold>

}
